package org.example.service;

import org.example.entity.UserBorrowDetail;

/**
 * @author Aaso
 * @version 1.0
 */
public interface BorrowService {
    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}