package r7;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f51120a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f51121b = r.o(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    private c() {
    }

    public static final List a(View view) {
        if (x7.a.c(c.class)) {
            return null;
        }
        try {
            s.h(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it = f51121b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = f7.f.b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
            return null;
        }
    }

    public static final JSONObject b(View view, View clickedView) {
        if (x7.a.c(c.class)) {
            return null;
        }
        try {
            s.h(view, "view");
            s.h(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = f7.f.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
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
            for (View view2 : f7.f.b(view)) {
                String strK = f7.f.k(view2);
                if (strK.length() > 0) {
                    arrayList.add(strK);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (x7.a.c(c.class)) {
            return null;
        }
        try {
            s.h(hostView, "hostView");
            String strK = f7.f.k(hostView);
            if (strK.length() > 0) {
                return strK;
            }
            String strJoin = TextUtils.join(" ", f51120a.c(hostView));
            s.g(strJoin, "join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
            return null;
        }
    }

    public static final void e(View view, JSONObject json) {
        if (x7.a.c(c.class)) {
            return;
        }
        try {
            s.h(view, "view");
            s.h(json, "json");
            try {
                String strK = f7.f.k(view);
                String strI = f7.f.i(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", f7.f.c(view));
                if (strK.length() > 0) {
                    json.put("text", strK);
                }
                if (strI.length() > 0) {
                    json.put("hint", strI);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, c.class);
        }
    }
}
