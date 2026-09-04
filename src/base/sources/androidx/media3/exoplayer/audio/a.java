package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.c0;
import com.google.common.collect.e0;
import com.google.common.collect.g0;
import com.google.common.collect.p1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t1.o;
import t1.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4990c = new a(c0.D(e.f4995d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c0 f4991d = c0.F(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final e0 f4992e = new e0.a().g(5, 6).g(17, 6).g(7, 6).g(30, 10).g(18, 6).g(6, 8).g(8, 8).g(14, 8).d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f4993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4994b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        private static g0 a() {
            g0.a aVarJ = new g0.a().j(8, 7);
            int i10 = w1.c0.f55769a;
            if (i10 >= 31) {
                aVarJ.j(26, 27);
            }
            if (i10 >= 33) {
                aVarJ.a(30);
            }
            return aVarJ.m();
        }

        public static boolean b(AudioManager audioManager, androidx.media3.exoplayer.audio.c cVar) {
            AudioDeviceInfo[] devices = cVar == null ? ((AudioManager) w1.a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{cVar.f5014a};
            g0 g0VarA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (g0VarA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {
        public static c0 a(t1.b bVar) {
            c0.a aVarR = c0.r();
            p1 it = a.f4992e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (w1.c0.f55769a >= w1.c0.J(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), bVar.a().f52564a)) {
                    aVarR.a(num);
                }
            }
            aVarR.a(2);
            return aVarR.m();
        }

        public static int b(int i10, int i11, t1.b bVar) {
            for (int i12 = 10; i12 > 0; i12--) {
                int iL = w1.c0.L(i12);
                if (iL != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iL).build(), bVar.a().f52564a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d {
        public static a a(AudioManager audioManager, t1.b bVar) {
            return new a(a.c(audioManager.getDirectProfilesForAttributes(bVar.a().f52564a)));
        }

        public static androidx.media3.exoplayer.audio.c b(AudioManager audioManager, t1.b bVar) {
            try {
                List<AudioDeviceInfo> audioDevicesForAttributes = ((AudioManager) w1.a.e(audioManager)).getAudioDevicesForAttributes(bVar.a().f52564a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new androidx.media3.exoplayer.audio.c(audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static boolean b() {
        String str = w1.c0.f55771c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c0 c(List list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(com.google.common.primitives.g.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfileA = d2.a.a(list.get(i10));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (w1.c0.w0(format) || f4992e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) w1.a.e((Set) map.get(Integer.valueOf(format)))).addAll(com.google.common.primitives.g.c(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(com.google.common.primitives.g.c(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        c0.a aVarR = c0.r();
        for (Map.Entry entry : map.entrySet()) {
            aVarR.a(new e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return aVarR.m();
    }

    private static c0 d(int[] iArr, int i10) {
        c0.a aVarR = c0.r();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            aVarR.a(new e(i11, i10));
        }
        return aVarR.m();
    }

    public static a e(Context context, t1.b bVar, AudioDeviceInfo audioDeviceInfo) {
        return g(context, bVar, (w1.c0.f55769a < 23 || audioDeviceInfo == null) ? null : new androidx.media3.exoplayer.audio.c(audioDeviceInfo));
    }

    static a f(Context context, Intent intent, t1.b bVar, androidx.media3.exoplayer.audio.c cVar) {
        AudioManager audioManager = (AudioManager) w1.a.e(context.getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        if (cVar == null) {
            cVar = w1.c0.f55769a >= 33 ? d.b(audioManager, bVar) : null;
        }
        int i10 = w1.c0.f55769a;
        if (i10 >= 33 && (w1.c0.A0(context) || w1.c0.t0(context))) {
            return d.a(audioManager, bVar);
        }
        if (i10 >= 23 && b.b(audioManager, cVar)) {
            return f4990c;
        }
        g0.a aVar = new g0.a();
        aVar.a(2);
        if (i10 >= 29 && (w1.c0.A0(context) || w1.c0.t0(context))) {
            aVar.k(c.a(bVar));
            return new a(d(com.google.common.primitives.g.n(aVar.m()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.k(f4991d);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new a(d(com.google.common.primitives.g.n(aVar.m()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.k(com.google.common.primitives.g.c(intArrayExtra));
        }
        return new a(d(com.google.common.primitives.g.n(aVar.m()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    static a g(Context context, t1.b bVar, androidx.media3.exoplayer.audio.c cVar) {
        return f(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), bVar, cVar);
    }

    private static int h(int i10) {
        int i11 = w1.c0.f55769a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(w1.c0.f55770b) && i10 == 1) {
            i10 = 2;
        }
        return w1.c0.L(i10);
    }

    static Uri j() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return w1.c0.s(this.f4993a, aVar.f4993a) && this.f4994b == aVar.f4994b;
    }

    public int hashCode() {
        return this.f4994b + (w1.c0.t(this.f4993a) * 31);
    }

    public Pair i(o oVar, t1.b bVar) {
        int iB = v.b((String) w1.a.e(oVar.f52757n), oVar.f52753j);
        if (!f4992e.containsKey(Integer.valueOf(iB))) {
            return null;
        }
        if (iB == 18 && !l(18)) {
            iB = 6;
        } else if ((iB == 8 && !l(8)) || (iB == 30 && !l(30))) {
            iB = 7;
        }
        if (!l(iB)) {
            return null;
        }
        e eVar = (e) w1.a.e((e) this.f4993a.get(iB));
        int iB2 = oVar.B;
        if (iB2 == -1 || iB == 18) {
            int i10 = oVar.C;
            if (i10 == -1) {
                i10 = 48000;
            }
            iB2 = eVar.b(i10, bVar);
        } else if (!oVar.f52757n.equals("audio/vnd.dts.uhd;profile=p2") || w1.c0.f55769a >= 33) {
            if (!eVar.c(iB2)) {
                return null;
            }
        } else if (iB2 > 10) {
            return null;
        }
        int iH = h(iB2);
        if (iH == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iH));
    }

    public boolean k(o oVar, t1.b bVar) {
        return i(oVar, bVar) != null;
    }

    public boolean l(int i10) {
        return w1.c0.q(this.f4993a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f4994b + ", audioProfiles=" + this.f4993a + "]";
    }

    private a(List list) {
        this.f4993a = new SparseArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = (e) list.get(i10);
            this.f4993a.put(eVar.f4996a, eVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f4993a.size(); i11++) {
            iMax = Math.max(iMax, ((e) this.f4993a.valueAt(i11)).f4997b);
        }
        this.f4994b = iMax;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f4995d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g0 f4998c;

        static {
            f4995d = w1.c0.f55769a >= 33 ? new e(2, a(10)) : new e(2, 10);
        }

        public e(int i10, Set set) {
            this.f4996a = i10;
            g0 g0VarV = g0.v(set);
            this.f4998c = g0VarV;
            p1 it = g0VarV.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f4997b = iMax;
        }

        private static g0 a(int i10) {
            g0.a aVar = new g0.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(w1.c0.L(i11)));
            }
            return aVar.m();
        }

        public int b(int i10, t1.b bVar) {
            if (this.f4998c != null) {
                return this.f4997b;
            }
            return w1.c0.f55769a >= 29 ? c.b(this.f4996a, i10, bVar) : ((Integer) w1.a.e((Integer) a.f4992e.getOrDefault(Integer.valueOf(this.f4996a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f4998c == null) {
                return i10 <= this.f4997b;
            }
            int iL = w1.c0.L(i10);
            if (iL == 0) {
                return false;
            }
            return this.f4998c.contains(Integer.valueOf(iL));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f4996a == eVar.f4996a && this.f4997b == eVar.f4997b && w1.c0.c(this.f4998c, eVar.f4998c);
        }

        public int hashCode() {
            int i10 = ((this.f4996a * 31) + this.f4997b) * 31;
            g0 g0Var = this.f4998c;
            return i10 + (g0Var == null ? 0 : g0Var.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f4996a + ", maxChannelCount=" + this.f4997b + ", channelMasks=" + this.f4998c + "]";
        }

        public e(int i10, int i11) {
            this.f4996a = i10;
            this.f4997b = i11;
            this.f4998c = null;
        }
    }
}
