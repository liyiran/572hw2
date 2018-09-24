/*
 * $Id$
 *
 * Copyright (c) 2003, 2004 WorldTicket A/S
 * All rights reserved.
 */
package liyiran.usc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Yiran Li / 2M business applications a|s
 * @version $Revision$ $Date$
 */
public interface CrawEntityRepository extends JpaRepository<WebPage, Integer> {
    @Query("select p from WebPage p where p.url=?1")
    public WebPage findByUrl(String url);
}
