package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzfkf;
import com.google.android.gms.internal.ads.zzgsx;
import com.google.android.gms.internal.ads.zzgty;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbs {
    public static boolean zza(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeq)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzer)).booleanValue() || i10 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x012e  */
    /* JADX WARN: Code duplicated, block: B:34:0x013b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0150  */
    /* JADX WARN: Code duplicated, block: B:46:0x0158  */
    /* JADX WARN: Code duplicated, block: B:48:0x015e A[Catch: JSONException -> 0x014e, TRY_LEAVE, TryCatch #7 {JSONException -> 0x014e, blocks: (B:31:0x0130, B:40:0x014a, B:48:0x015e, B:47:0x015a), top: B:73:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0181 A[Catch: Exception -> 0x019c, TRY_LEAVE, TryCatch #1 {Exception -> 0x019c, blocks: (B:53:0x017b, B:55:0x0181), top: B:67:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static JSONObject zzb(Context context, View view) {
        int i10;
        ViewParent parent;
        String str;
        ViewGroup.LayoutParams layoutParams;
        int iHashCode;
        JSONObject jSONObjectZzl;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            int i11 = 1;
            try {
                int[] iArrZzg = zzg(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i10 = i11;
                    try {
                        iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                        iArr[i10] = Math.min(viewGroup.getMeasuredHeight(), iArr[i10]);
                        parent2 = parent2.getParent();
                        i11 = i10;
                    } catch (Exception unused) {
                        int i12 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                            try {
                                str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                int i13 = zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (NoSuchMethodException unused2) {
                                str = "";
                            } catch (SecurityException e11) {
                                e = e11;
                                int i14 = zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                int i15 = zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        iHashCode = str.hashCode();
                        if (iHashCode != -2066603854) {
                            if (iHashCode != 2019754500) {
                                jSONObject.put("native_template_type", 0);
                            } else {
                                jSONObject.put("native_template_type", 2);
                            }
                        } else if (str.equals("small_template")) {
                            jSONObject.put("native_template_type", i10);
                        } else {
                            jSONObject.put("native_template_type", 0);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjh)).booleanValue()) {
                            try {
                                layoutParams = view.getLayoutParams();
                                if (layoutParams != null) {
                                    jSONObject.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                                    jSONObject.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                                }
                            } catch (Exception unused3) {
                                zze.zza("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjl)).booleanValue()) {
                            try {
                                jSONObject.put("alpha", view.getAlpha());
                            } catch (JSONException e13) {
                                int i16 = zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log container view alpha signal to JSON", e13);
                            }
                        }
                        return jSONObject;
                    }
                }
                i10 = i11;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredWidth()));
                jSONObject2.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredHeight()));
                jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArrZzg[0]));
                jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArrZzg[i10]));
                jSONObject2.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[0]));
                jSONObject2.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[i10]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectZzl = zzl(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArrZzg[0]));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArrZzg[i10]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectZzl = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectZzl);
            } catch (Exception unused4) {
                i10 = i11;
            }
            parent = view.getParent();
            if (parent != null) {
                str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
            } else {
                str = "";
            }
            try {
                iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode != 2019754500 && str.equals("medium_template")) {
                        jSONObject.put("native_template_type", 2);
                    } else {
                        jSONObject.put("native_template_type", 0);
                    }
                } else if (str.equals("small_template")) {
                    jSONObject.put("native_template_type", i10);
                } else {
                    jSONObject.put("native_template_type", 0);
                }
            } catch (JSONException e14) {
                int i17 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log native template signal to JSON", e14);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjh)).booleanValue()) {
                layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    jSONObject.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                    jSONObject.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjl)).booleanValue()) {
                jSONObject.put("alpha", view.getAlpha());
            }
        }
        return jSONObject;
    }

    public static JSONObject zzc(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjd)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzje)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        jSONObject.put("contained_in_scroll_view", zzs.zzA(view) != 0);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjf)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        jSONObject.put("scroll_view_type", zzs.zzA(view));
                        return jSONObject;
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("can_show_on_lock_screen", zzs.zzo(view));
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("is_keyguard_locked", zzs.zzG(context));
                return jSONObject;
            } catch (JSONException unused) {
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zze(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        ViewGroup.LayoutParams layoutParams;
        String str3 = "ad_view";
        String str4 = "relative_to";
        String str5 = dOIDCKnIR.SYQaHZsakqhf;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrZzg = zzg(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrZzg2 = zzg(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = iArrZzg;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view2.getMeasuredHeight()));
                            jSONObject4.put(str5, com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArrZzg2[0] - iArr[0]));
                            jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArrZzg2[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = zzl(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put(str5, com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArrZzg2[0] - iArr[0]));
                                jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArrZzg2[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjg)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjh)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject3.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjk)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    int i10 = zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get asset views information");
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjl)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    iArrZzg = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject zzf(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.x));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e10) {
                    int i10 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while putting signals into JSON object.", e10);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e11) {
                e = e11;
                jSONObject = jSONObject2;
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public static int[] zzg(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zzh(MotionEvent motionEvent, View view) {
        int[] iArrZzg = zzg(view);
        return new Point(((int) motionEvent.getRawX()) - iArrZzg[0], ((int) motionEvent.getRawY()) - iArrZzg[1]);
    }

    public static boolean zzi(Context context, zzfkf zzfkfVar) {
        if (!zzfkfVar.zzN) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjm)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjp)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjn);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzgty.zza(zzgsx.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject zzj(Context context) {
        JSONObject jSONObject = new JSONObject();
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzv = zzs.zzv((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, displayMetricsZzv.widthPixels));
            jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, displayMetricsZzv.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams zzk() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjo)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static JSONObject zzl(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzm(int i10) {
        if (i10 != -2) {
            return i10 != -1 ? 2 : 3;
        }
        return 4;
    }
}
