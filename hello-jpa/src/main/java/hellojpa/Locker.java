package hellojpa;

import javax.persistence.*;

@Entity
public class Locker {
    @Id
    @GeneratedValue
    @Column(name = "LOCKER_ID")
    private long id;

    private String name;

    @OneToOne(mappedBy = "locker")
    private Member member;
}
