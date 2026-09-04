package f7;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.internal.e1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f38332a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38333b = f.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static WeakReference f38334c = new WeakReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f38335d;

    private f() {
    }

    public static final View a(View view) {
        if (x7.a.c(f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f38332a.q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                x7.a.b(th2, f.class);
            }
        }
        return null;
    }

    public static final List b(View view) {
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    public static final int c(View view) {
        if (x7.a.c(f.class)) {
            return 0;
        }
        try {
            s.h(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            if (o(view)) {
                i10 |= 512;
            }
            if (view instanceof TextView) {
                int i11 = i10 | 1025;
                if (view instanceof Button) {
                    i11 = i10 | 1029;
                    if (view instanceof Switch) {
                        i11 = i10 | 9221;
                    } else if (view instanceof CheckBox) {
                        i11 = 33797 | i10;
                    }
                }
                return view instanceof EditText ? i11 | 2048 : i11;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return 65536 | i10;
                }
                if (view instanceof RadioGroup) {
                    return i10 | 16384;
                }
                return ((view instanceof ViewGroup) && f38332a.p(view, (View) f38334c.get())) ? i10 | 64 : i10;
            }
            return i10 | 4096;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            s.h(view, "view");
            if (s.c(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f38334c = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List listB = b(view);
                int size = listB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(d((View) listB.get(i10)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e10) {
                Log.e(f38333b, "Failed to create JSONObject for view.", e10);
                return jSONObject;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    private final JSONObject e(View view) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put(TtmlNode.LEFT, view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e10) {
                Log.e(f38333b, "Failed to create JSONObject for dimension.", e10);
                return jSONObject;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final Class f(String str) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            s.f(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        try {
            if (x7.a.c(f.class)) {
                return null;
            }
            try {
                Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(view);
                if (obj == null) {
                    return null;
                }
                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(obj);
                s.f(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                return (View.OnTouchListener) obj2;
            } catch (ClassNotFoundException e10) {
                e1.k0(f38333b, e10);
                return null;
            } catch (IllegalAccessException e11) {
                e1.k0(f38333b, e11);
                return null;
            } catch (NoSuchFieldException e12) {
                e1.k0(f38333b, e12);
                return null;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    public static final String i(View view) {
        CharSequence hint;
        String string;
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    public static final ViewGroup j(View view) {
        if (x7.a.c(f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0102 A[EDGE_INSN: B:43:0x0102->B:44:0x0103 BREAK  A[LOOP:0: B:33:0x00d6->B:39:0x00f0]] */
    public static final String k(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i10);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            s.g(currentHour, "view.currentHour");
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            s.g(currentMinute, "view.currentMinute");
                            int iIntValue2 = currentMinute.intValue();
                            o0 o0Var = o0.f43602a;
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
                            s.g(charSequenceValueOf, "format(format, *args)");
                        }
                    } else {
                        int year = ((DatePicker) view).getYear();
                        int month = ((DatePicker) view).getMonth();
                        int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                        o0 o0Var2 = o0.f43602a;
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                        s.g(charSequenceValueOf, "format(format, *args)");
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL;
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    private final View l(float[] fArr, View view) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            n();
            Method method = f38335d;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Object objInvoke = method.invoke(null, fArr, view);
                    s.f(objInvoke, "null cannot be cast to non-null type android.view.View");
                    View view2 = (View) objInvoke;
                    if (view2.getId() > 0) {
                        Object parent = view2.getParent();
                        s.f(parent, "null cannot be cast to non-null type android.view.View");
                        return (View) parent;
                    }
                } catch (IllegalAccessException e10) {
                    e1.k0(f38333b, e10);
                } catch (InvocationTargetException e11) {
                    e1.k0(f38333b, e11);
                }
            }
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final float[] m(View view) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    private final void n() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (f38335d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f38335d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e10) {
                e1.k0(f38333b, e10);
            } catch (NoSuchMethodException e11) {
                e1.k0(f38333b, e11);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private static final boolean o(View view) {
        if (x7.a.c(f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            f fVar = f38332a;
            Class clsF = fVar.f("android.support.v4.view.NestedScrollingChild");
            if (clsF != null && clsF.isInstance(parent)) {
                return true;
            }
            Class clsF2 = fVar.f("androidx.core.view.NestedScrollingChild");
            return clsF2 != null && clsF2.isInstance(parent);
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return false;
        }
    }

    private final boolean q(View view) {
        if (x7.a.c(this)) {
            return false;
        }
        try {
            return s.c(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field declaredField;
        Field declaredField2;
        if (x7.a.c(f.class)) {
            return;
        }
        try {
            s.h(view, "view");
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                declaredField = null;
            }
            if (declaredField == null || declaredField2 == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            try {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                declaredField2.set(obj, onClickListener);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
        }
    }

    public static final void s(View view, JSONObject json) {
        if (x7.a.c(f.class)) {
            return;
        }
        try {
            s.h(view, "view");
            s.h(json, "json");
            try {
                String strK = k(view);
                String strI = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", c(view));
                json.put("id", view.getId());
                if (d.g(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", e1.k(e1.I0(strK), ""));
                }
                json.put("hint", e1.k(e1.I0(strI), ""));
                if (tag != null) {
                    json.put("tag", e1.k(e1.I0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", e1.k(e1.I0(contentDescription.toString()), ""));
                }
                json.put("dimension", f38332a.e(view));
            } catch (JSONException e10) {
                e1.k0(f38333b, e10);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
        }
    }

    public final boolean p(View view, View view2) {
        View viewL;
        if (x7.a.c(this)) {
            return false;
        }
        try {
            s.h(view, "view");
            return s.c(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") && (viewL = l(m(view), view2)) != null && viewL.getId() == view.getId();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }
}
