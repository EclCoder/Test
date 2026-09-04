package net.openid.appauth;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static String a(Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            wm.d.a(!TextUtils.isEmpty(str), "individual scopes cannot be null or empty");
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }

    public static Set b(String str) {
        if (str == null) {
            return null;
        }
        List listAsList = Arrays.asList(TextUtils.split(str, " "));
        LinkedHashSet linkedHashSet = new LinkedHashSet(listAsList.size());
        linkedHashSet.addAll(listAsList);
        return linkedHashSet;
    }
}
