package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birghtday = new FormData();
        post.birghtday.day = 13;
        post.birghtday.month = 6;
        post.birghtday.year = 1999;
    }
}
