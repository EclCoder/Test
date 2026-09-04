package zm;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import wm.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static void a(Uri.Builder builder, String str, Object obj) {
        if (obj == null || obj.toString() == null) {
            return;
        }
        builder.appendQueryParameter(str, obj.toString());
    }

    public static String b(Map map) {
        if (map == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + c((String) entry.getValue()));
        }
        return TextUtils.join("&", arrayList);
    }

    public static String c(String str) {
        d.e(str);
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalStateException("Unable to encode using UTF-8");
        }
    }

    public static Long d(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return Long.valueOf(Long.parseLong(queryParameter));
        }
        return null;
    }

    public static Uri e(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static List f(Uri[] uriArr, int i10) {
        d.a(i10 >= 0, "startIndex must be positive");
        if (uriArr == null || uriArr.length <= i10) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(uriArr.length - i10);
        while (i10 < uriArr.length) {
            if (uriArr[i10] == null) {
                a.g("Null URI in possibleUris list - ignoring", new Object[0]);
            } else {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.otherurls.URL", uriArr[i10]);
                arrayList.add(bundle);
            }
            i10++;
        }
        return arrayList;
    }
}
