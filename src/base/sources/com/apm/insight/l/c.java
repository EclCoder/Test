package com.apm.insight.l;

import android.os.Debug;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f10837a = new b(0);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        private a() {
        }

        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends a {
        private b() {
            super((byte) 0);
        }

        @Override // com.apm.insight.l.c.a
        public final int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.insight.l.c.a
        public final int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }

        /* synthetic */ b(byte b10) {
            this();
        }
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        return f10837a.a(memoryInfo);
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        return f10837a.b(memoryInfo);
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        return f10837a.c(memoryInfo);
    }

    /* JADX INFO: renamed from: com.apm.insight.l.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static /* synthetic */ class AnonymousClass1 {
        public static Long a(Map<? super String, Long> map, String str, Long l10) {
            if (str == null || map == null) {
                return -1L;
            }
            Long l11 = map.get(str);
            if (l11 != null) {
                l10 = Long.valueOf(l11.longValue() + l10.longValue());
            }
            map.put(str, l10);
            return l10;
        }

        public static Float a(Map<? super String, Float> map) {
            float fFloatValue = 0.0f;
            for (Float f10 : map.values()) {
                if (f10 != null) {
                    fFloatValue += f10.floatValue();
                }
            }
            return Float.valueOf(fFloatValue);
        }

        public static int a(Object obj, int i10) {
            if (obj != null) {
                if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                }
                if (obj instanceof String) {
                    try {
                        return Integer.parseInt(String.valueOf(obj));
                    } catch (Throwable unused) {
                    }
                }
            }
            return i10;
        }
    }
}
