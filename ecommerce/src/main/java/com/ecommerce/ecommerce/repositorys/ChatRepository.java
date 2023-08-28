package com.ecommerce.ecommerce.repositorys;

import com.ecommerce.ecommerce.models.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat,Integer> {
}
