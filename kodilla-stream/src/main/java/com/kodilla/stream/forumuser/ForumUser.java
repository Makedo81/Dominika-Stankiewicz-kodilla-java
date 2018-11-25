package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser { //tworzy obiekt uzytkownika Forum

    private final int userId;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final int post;

    public ForumUser(final int userId,final String name,final char sex,final int yearOfBirth,
                     final int monthOfBirth,final int dayOfBirth,final int post) {

        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.post = post;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPost() {
        return post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userId != forumUser.userId) return false;
        return birthDate.equals(forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + birthDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", post=" + post +
                '}';
    }
}
