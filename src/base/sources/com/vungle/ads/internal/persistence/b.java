package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.util.f;
import com.vungle.ads.internal.util.j;
import com.vungle.ads.internal.util.s;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static final String FILENAME = "settings_vungle";
    public static final String TPAT_FAILED_FILENAME = "vngFailedTpats";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, b> filePreferenceMap = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b get$default(a aVar, Executor executor, s sVar, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = b.FILENAME;
            }
            return aVar.get(executor, sVar, str);
        }

        public final synchronized b get(Executor ioExecutor, s pathProvider, String filename) {
            Object bVar;
            Object objPutIfAbsent;
            try {
                kotlin.jvm.internal.s.h(ioExecutor, "ioExecutor");
                kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
                kotlin.jvm.internal.s.h(filename, "filename");
                ConcurrentHashMap concurrentHashMap = b.filePreferenceMap;
                bVar = concurrentHashMap.get(filename);
                if (bVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (bVar = new b(ioExecutor, pathProvider, filename, null)))) != null) {
                    bVar = objPutIfAbsent;
                }
                kotlin.jvm.internal.s.g(bVar, "filePreferenceMap.getOrP…, filename)\n            }");
            } catch (Throwable th2) {
                throw th2;
            }
            return (b) bVar;
        }

        private a() {
        }

        public static /* synthetic */ void getFILENAME$annotations() {
        }
    }

    public /* synthetic */ b(Executor executor, s sVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, sVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m120apply$lambda0(b this$0, Serializable serializable) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(serializable, "$serializable");
        j.writeSerializable(this$0.file, serializable);
    }

    public static final synchronized b get(Executor executor, s sVar, String str) {
        return Companion.get(executor, sVar, str);
    }

    public final void apply() {
        final HashMap map = new HashMap(this.values);
        this.ioExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.persistence.a
            @Override // java.lang.Runnable
            public final void run() {
                b.m120apply$lambda0(this.f35841a, map);
            }
        });
    }

    public final boolean getBoolean(String key, boolean z10) {
        kotlin.jvm.internal.s.h(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public final int getInt(String key, int i10) {
        kotlin.jvm.internal.s.h(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Integer ? ((Number) obj).intValue() : i10;
    }

    public final long getLong(String key, long j10) {
        kotlin.jvm.internal.s.h(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : j10;
    }

    public final String getString(String key, String defaultValue) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    public final HashSet<String> getStringSet(String key, HashSet<String> defaultValue) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof HashSet ? f.getNewHashSet((HashSet) obj) : defaultValue;
    }

    public final b put(String key, boolean z10) {
        kotlin.jvm.internal.s.h(key, "key");
        this.values.put(key, Boolean.valueOf(z10));
        return this;
    }

    public final b remove(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    private b(Executor executor, s sVar, String str) {
        this.ioExecutor = executor;
        File file = new File(sVar.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object serializable = j.readSerializable(file);
        if (serializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) serializable);
        }
    }

    public final b put(String key, String value) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        this.values.put(key, value);
        return this;
    }

    public final Boolean getBoolean(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final String getString(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final b put(String key, int i10) {
        kotlin.jvm.internal.s.h(key, "key");
        this.values.put(key, Integer.valueOf(i10));
        return this;
    }

    public final b put(String key, HashSet<String> hashSet) {
        kotlin.jvm.internal.s.h(key, "key");
        this.values.put(key, f.getNewHashSet(hashSet));
        return this;
    }

    public final b put(String key, long j10) {
        kotlin.jvm.internal.s.h(key, "key");
        this.values.put(key, Long.valueOf(j10));
        return this;
    }

    /* synthetic */ b(Executor executor, s sVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, sVar, (i10 & 4) != 0 ? FILENAME : str);
    }
}
