package DataMahasiswa;



import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadi
 */
public class operasi {
    private static List<data> listData = new LinkedList<data>();
    public static void addData(data data) {
        listData.add(data);
    }

    public static void editData(data data, int idx) {
        listData.set(idx, data);
    }

    public static void removeData(int idx) {
        listData.remove(idx);
    }

    public static List<data> getListData() {
        return listData;
    }
}


