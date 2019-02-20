package com.kodilla.kodillahibernate.tasklist;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {

    private int id;
    private String listName;
    private String description;
//    private List<Task> tasks = new ArrayList<>();

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
    //    @OneToMany(
//    targetEntity = Task.class,
//    mappedBy = "taskList",
//    cascade = CascadeType.ALL,
//    fetch = FetchType.LAZY)
//    @ManyToOne
//    @JoinColumn(name= "TASKLIST_ID")
//    public List<Task> getTasks() {
//        return tasks;
//    }

//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
//    }
//}
