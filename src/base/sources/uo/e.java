package uo;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class e implements Serializable, Comparator {
    private static final long serialVersionUID = 4466565437490631532L;

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c cVar, c cVar2) {
        int iCompareTo = cVar.getName().compareTo(cVar2.getName());
        if (iCompareTo == 0) {
            String strG = cVar.g();
            String str = "";
            if (strG == null) {
                strG = "";
            } else if (strG.indexOf(46) == -1) {
                strG = strG + ".local";
            }
            String strG2 = cVar2.g();
            if (strG2 != null) {
                if (strG2.indexOf(46) == -1) {
                    str = strG2 + ".local";
                } else {
                    str = strG2;
                }
            }
            iCompareTo = strG.compareToIgnoreCase(str);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        String strW = cVar.w();
        if (strW == null) {
            strW = "/";
        }
        String strW2 = cVar2.w();
        return strW.compareTo(strW2 != null ? strW2 : "/");
    }
}
