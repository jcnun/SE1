package org.hbrs.se1.ws21.uebung2;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Member> _objects;

    public Container() {
        this._objects = new ArrayList<>();
    }

    public void addMember(Member member) throws ContainerException {
        if (this.find(member.getID()) != -1) {
            throw new ContainerException("Das Member-Objekt mit der ID " + member.getID().toString() + " ist bereits vorhanden!");
        }
        this._objects.add(member);
    }

    public String deleteMember(Integer id) {
        int index = this.find(id);
        if (index == -1) {
            return "Das Member-Objekt mit der ID " + id.toString() + " ist nicht vorhanden!";
        }
        this._objects.remove(index);
        return "";
    }

    public void dump() {
        for (int i = 0; i < this._objects.size(); ++i) {
            System.out.println(this._objects.get(i));
        }
    }

    public int size() {
        return this._objects.size();
    }

    private int find(Integer id) {
        for (int i = 0; i < this._objects.size(); ++i) {
            if (id.equals(this._objects.get(i).getID())) {
                return i;
            }
        }
        return -1;
    }
}
