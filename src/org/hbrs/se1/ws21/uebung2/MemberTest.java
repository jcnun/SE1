package org.hbrs.se1.ws21.uebung2;

public class MemberTest implements Member {
    private Integer _id;

    public MemberTest(Integer id) {
        this._id = id;
    }

    @Override
    public Integer getID() {
        return this._id;
    }

    @Override
    public String toString() {
        return "Member (ID = " + this._id.toString() + ")";
    }
}
