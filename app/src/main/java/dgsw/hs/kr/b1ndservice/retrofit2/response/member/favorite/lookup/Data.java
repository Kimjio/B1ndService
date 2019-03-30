package dgsw.hs.kr.b1ndservice.retrofit2.response.member.favorite.lookup;

import dgsw.hs.kr.b1ndservice.model.Favorite;

/**
 * @author dawncrow
 * @date 2018. 1. 18.
 */
public class Data {
    private Favorite[] favorites;

    public Favorite[] getFavorites() {
        return favorites;
    }

    public void setFavorites(Favorite[] value) {
        this.favorites = value;
    }
}
