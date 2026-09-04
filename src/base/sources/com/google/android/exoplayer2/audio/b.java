package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.google.common.collect.e0;
import com.google.common.collect.g0;
import com.google.common.collect.p1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import ob.r0;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f16558c = new b(new int[]{2}, 10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c0 f16559d = c0.F(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e0 f16560e = new e0.a().g(5, 6).g(17, 6).g(7, 6).g(30, 10).g(18, 6).g(6, 8).g(8, 8).g(14, 8).d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f16561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16562b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        private static final g0 a() {
            g0.a aVarJ = new g0.a().j(8, 7);
            int i10 = r0.f48425a;
            if (i10 >= 31) {
                aVarJ.j(26, 27);
            }
            if (i10 >= 33) {
                aVarJ.a(30);
            }
            return aVarJ.m();
        }

        public static final boolean b(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) ob.a.e((AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO))).getDevices(2);
            g0 g0VarA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (g0VarA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0278b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AudioAttributes f16563a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static c0 a() {
            c0.a aVarR = c0.r();
            p1 it = b.f16560e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (r0.f48425a >= 34 || iIntValue != 30) {
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f16563a)) {
                        aVarR.a(num);
                    }
                }
            }
            aVarR.a(2);
            return aVarR.m();
        }

        public static int b(int i10, int i11) {
            for (int i12 = 10; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(r0.H(i12)).build(), f16563a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public b(int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f16561a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f16561a = new int[0];
        }
        this.f16562b = i10;
    }

    private static boolean b() {
        if (r0.f48425a < 17) {
            return false;
        }
        String str = r0.f48427c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    public static b c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static b d(Context context, Intent intent) {
        int i10 = r0.f48425a;
        if (i10 >= 23 && a.b(context)) {
            return f16558c;
        }
        g0.a aVar = new g0.a();
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            aVar.k(f16559d);
        }
        if (i10 >= 29 && (r0.E0(context) || r0.z0(context))) {
            aVar.k(C0278b.a());
            return new b(com.google.common.primitives.g.n(aVar.m()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            g0 g0VarM = aVar.m();
            return !g0VarM.isEmpty() ? new b(com.google.common.primitives.g.n(g0VarM), 10) : f16558c;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.k(com.google.common.primitives.g.c(intArrayExtra));
        }
        return new b(com.google.common.primitives.g.n(aVar.m()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    private static int e(int i10) {
        int i11 = r0.f48425a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(r0.f48426b) && i10 == 1) {
            i10 = 2;
        }
        return r0.H(i10);
    }

    static Uri g() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static int h(int i10, int i11) {
        return r0.f48425a >= 29 ? C0278b.b(i10, i11) : ((Integer) ob.a.e((Integer) f16560e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Arrays.equals(this.f16561a, bVar.f16561a) && this.f16562b == bVar.f16562b;
    }

    public Pair f(v0 v0Var) {
        int iF = y.f((String) ob.a.e(v0Var.f18868l), v0Var.f18865i);
        if (!f16560e.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !j(18)) {
            iF = 6;
        } else if ((iF == 8 && !j(8)) || (iF == 30 && !j(30))) {
            iF = 7;
        }
        if (!j(iF)) {
            return null;
        }
        int iH = v0Var.f18881y;
        if (iH == -1 || iF == 18) {
            int i10 = v0Var.f18882z;
            if (i10 == -1) {
                i10 = 48000;
            }
            iH = h(iF, i10);
        } else if (v0Var.f18868l.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (iH > 10) {
                return null;
            }
        } else if (iH > this.f16562b) {
            return null;
        }
        int iE = e(iH);
        if (iE == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iE));
    }

    public int hashCode() {
        return this.f16562b + (Arrays.hashCode(this.f16561a) * 31);
    }

    public boolean i(v0 v0Var) {
        return f(v0Var) != null;
    }

    public boolean j(int i10) {
        return Arrays.binarySearch(this.f16561a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f16562b + ", supportedEncodings=" + Arrays.toString(this.f16561a) + "]";
    }
}
