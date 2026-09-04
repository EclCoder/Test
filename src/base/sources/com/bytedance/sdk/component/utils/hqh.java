package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hqh {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static Map<String, Method> f13001hn = new HashMap();
    public static final Class<?>[] hnj;
    private static final HashMap<Class<?>, Class<?>> qor;

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        qor = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        hnj = new Class[0];
    }

    public static int hnj(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int hnj(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
