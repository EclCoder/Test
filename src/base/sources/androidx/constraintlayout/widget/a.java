package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f2647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0023a f2648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f2651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f2652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2653h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum EnumC0023a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, EnumC0023a enumC0023a, Object obj, boolean z10) {
        this.f2647b = str;
        this.f2648c = enumC0023a;
        this.f2646a = z10;
        k(obj);
    }

    public static HashMap b(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e12);
            }
        }
        return map2;
    }

    public static void i(Context context, XmlPullParser xmlPullParser, HashMap map) {
        EnumC0023a enumC0023a;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f2797a5);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0023a enumC0023a2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == f.f2810b5) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == f.f2940l5) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == f.f2823c5) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0023a2 = EnumC0023a.BOOLEAN_TYPE;
            } else {
                if (index == f.f2849e5) {
                    enumC0023a = EnumC0023a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == f.f2836d5) {
                    enumC0023a = EnumC0023a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == f.f2901i5) {
                    enumC0023a = EnumC0023a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == f.f2862f5) {
                    enumC0023a = EnumC0023a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.f2875g5) {
                    enumC0023a = EnumC0023a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == f.f2888h5) {
                    enumC0023a = EnumC0023a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == f.f2927k5) {
                    enumC0023a = EnumC0023a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == f.f2914j5) {
                    enumC0023a = EnumC0023a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0023a2 = enumC0023a;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new a(string, enumC0023a2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void j(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            String str2 = aVar.f2646a ? str : "set" + str;
            try {
                int iOrdinal = aVar.f2648c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f2649d));
                        break;
                    case 1:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f2650e));
                        break;
                    case 2:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f2653h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f2653h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f2651f);
                        break;
                    case 5:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f2652g));
                        break;
                    case 6:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f2650e));
                        break;
                    case 7:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f2649d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e12);
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f2647b;
        if (this.f2646a) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            int iOrdinal = this.f2648c.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            switch (iOrdinal) {
                case 0:
                case 7:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f2649d));
                    break;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f2650e));
                    break;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f2653h));
                    break;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f2653h);
                    method.invoke(view, colorDrawable);
                    break;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f2651f);
                    break;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f2652g));
                    break;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f2650e));
                    break;
            }
        } catch (IllegalAccessException e10) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e10);
        } catch (NoSuchMethodException e11) {
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e11);
        } catch (InvocationTargetException e12) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e12);
        }
    }

    public String c() {
        return this.f2647b;
    }

    public EnumC0023a d() {
        return this.f2648c;
    }

    public float e() {
        switch (this.f2648c) {
            case INT_TYPE:
                return this.f2649d;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.f2650e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.f2652g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void f(float[] fArr) {
        switch (this.f2648c) {
            case INT_TYPE:
                fArr[0] = this.f2649d;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f2650e;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i10 = this.f2653h;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.f2652g ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f2650e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int iOrdinal = this.f2648c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public int h() {
        int iOrdinal = this.f2648c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void k(Object obj) {
        switch (this.f2648c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f2649d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f2650e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f2653h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f2651f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f2652g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f2650e = ((Float) obj).floatValue();
                break;
        }
    }

    public a(a aVar, Object obj) {
        this.f2646a = false;
        this.f2647b = aVar.f2647b;
        this.f2648c = aVar.f2648c;
        k(obj);
    }
}
