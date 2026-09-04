package c7;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import bm.o;
import bm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f9577a = new c();

    private c() {
    }

    public static final List b(View view) {
        if (x7.a.c(c.class)) {
            return null;
        }
        try {
            s.h(view, "view");
            ArrayList arrayList = new ArrayList();
            arrayList.add(f7.f.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            int i10 = 0;
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    s.g(resourceName, "resourceName");
                    String[] strArr = (String[]) new o("/").j(resourceName, 0).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
            return null;
        }
    }

    private final List c(View view) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator it = f7.f.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final boolean d(String str, List list) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (r.T(str, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    public static final boolean e(List indicators, List keys) {
        if (x7.a.c(c.class)) {
            return false;
        }
        try {
            s.h(indicators, "indicators");
            s.h(keys, "keys");
            Iterator it = indicators.iterator();
            while (it.hasNext()) {
                if (f9577a.d((String) it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
            return false;
        }
    }

    public static final boolean f(String text, String rule) {
        if (x7.a.c(c.class)) {
            return false;
        }
        try {
            s.h(text, "text");
            s.h(rule, "rule");
            return new o(rule).h(text);
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
            return false;
        }
    }

    public static final List a(View view) {
        if (x7.a.c(c.class)) {
            return null;
        }
        try {
            s.h(view, WwUgngZLNA.yCbKGihPqdObCtR);
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupJ = f7.f.j(view);
            if (viewGroupJ != null) {
                for (View view2 : f7.f.b(viewGroupJ)) {
                    if (view != view2) {
                        arrayList.addAll(f9577a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
            return null;
        }
    }
}
