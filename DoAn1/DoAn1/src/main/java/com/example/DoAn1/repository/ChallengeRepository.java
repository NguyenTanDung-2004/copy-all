package com.example.DoAn1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.DoAn1.entities.Challenge;
import com.example.DoAn1.entities.Excercise;

import java.util.List;

public interface ChallengeRepository extends JpaRepository<Challenge, String> {
    @Query(value = "SELECT e.*\n" + //
            "FROM challenge c\n" + //
            "INNER JOIN exercise e ON c.exercise_id = e.id;", nativeQuery = true)
    public List<Excercise> getListExercise();
}
