package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
           //저장
            Team team = new Team();
            team.setName("TeamA");;
            em.persist(team);

            Member member = new Member();
            member.setName("member1");;
            member.setTeam(team);

            //조회
            Member findMember = em.find(Member.class, member.getId());

            Team findTeam = findMember.getTeam();
            System.out.println("findTema = " + findTeam.getName());

            tx.commit();
        }
        catch (Exception e){
            tx.rollback();
        }
        finally {
            em.close();
        }
        em.close();

        emf.close();
    }
}
