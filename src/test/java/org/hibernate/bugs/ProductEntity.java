package org.hibernate.bugs;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Petar Tahchiev
 * @since 1.5
 */
@Entity
public class ProductEntity {

    @Id
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
