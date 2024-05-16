package com.jcamilo.managementtask.model;

import java.util.Date;

public class Task {
    private String title_task;  // Título de la tarea
    private String desc_task;   // Descripción de la tarea
    private Date due_date;      // Fecha de vencimiento de la tarea
    private boolean alarm_task; // Alarma para la tarea

    public Task(String title_task, String desc_task, Date due_date, boolean alarm_task) {
        this.title_task = title_task;
        this.desc_task = desc_task;
        this.due_date = due_date;
        this.alarm_task = alarm_task;
    }

    // Getters y Setters
    public String getTitle_task() {
        return title_task;
    }

    public void setTitle_task(String title_task) {
        this.title_task = title_task;
    }

    public String getDesc_task() {
        return desc_task;
    }

    public void setDesc_task(String desc_task) {
        this.desc_task = desc_task;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public boolean isAlarm_task() {
        return alarm_task;
    }

    public void setAlarm_task(boolean alarm_task) {
        this.alarm_task = alarm_task;
    }
}
