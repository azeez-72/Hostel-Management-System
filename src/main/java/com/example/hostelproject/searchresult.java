package com.example.hostelproject;

public class searchresult {
    char block;
    int rollno;
    String name;
    String roomno;
    int due, subtract, add;

    public void setAdd(int add) {
        this.add = add;
    }

    public void setSubtract(int subtract) {
        this.subtract = subtract;
    }

    public void setDue(int due) {
        this.due = due;
    }

    public int getAdd() {
        return add;
    }

    public int getSubtract() {
        return subtract;
    }

    public int getDue() {
        return due;
    }

    public void setBlock(char block) {
        this.block = block;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public char getBlock() {
        return block;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getRoomno() {
        return roomno;
    }
}
