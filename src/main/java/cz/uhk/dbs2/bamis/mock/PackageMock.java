package cz.uhk.dbs2.bamis.mock;

import cz.uhk.dbs2.bamis.model.Good;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David Sladecek
 */
public class PackageMock {
    private List<Good> packages;

    private static PackageMock instance = null;
    public static PackageMock getInstance(){
        if(instance == null){
            instance = new PackageMock();
        }
        return instance;
    }

    public PackageMock(){
        packages = new ArrayList<>();
        packages.add(new Good(3));
        packages.add(new Good(4));
        packages.add(new Good(5));
        packages.add(new Good(6));
    }

    public Good getGoodByID (int id){
        for(Good g: packages){
            if(g.getZasilkaId()==id){
                return g;
            }
        }
        return null;
    }

    public List<Good> getAllGoods(){
        return packages;
    }
}
