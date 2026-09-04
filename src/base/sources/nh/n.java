package nh;

import android.content.Context;
import android.os.Build;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.provider.Settings;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f47744a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Vibrator f47745b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        BUBBLE_SNAP(40);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ ml.a f47748d = ml.b.a(d());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f47749a;

        a(long j10) {
            this.f47749a = j10;
        }

        public final long g() {
            return this.f47749a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47750a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.BUBBLE_SNAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f47750a = iArr;
        }
    }

    private n() {
    }

    private final boolean a(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 1) == 0;
    }

    private final VibrationEffect c(a aVar) {
        if (b.f47750a[aVar.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        VibrationEffect vibrationEffectCreatePredefined = VibrationEffect.createPredefined(5);
        kotlin.jvm.internal.s.g(vibrationEffectCreatePredefined, "createPredefined(...)");
        return vibrationEffectCreatePredefined;
    }

    private final Vibrator d(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            Object systemService = context.getSystemService("vibrator");
            if (systemService instanceof Vibrator) {
                return (Vibrator) systemService;
            }
            return null;
        }
        Object systemService2 = context.getSystemService("vibrator_manager");
        VibratorManager vibratorManagerA = l.a(systemService2) ? m.a(systemService2) : null;
        if (vibratorManagerA != null) {
            return vibratorManagerA.getDefaultVibrator();
        }
        return null;
    }

    private final VibrationAttributes e() {
        VibrationAttributes vibrationAttributesBuild = k.a().setUsage(18).build();
        kotlin.jvm.internal.s.g(vibrationAttributesBuild, "build(...)");
        return vibrationAttributesBuild;
    }

    private final Vibrator f(Context context) {
        Vibrator vibrator = f47745b;
        if (vibrator == null) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext(...)");
            Vibrator vibratorD = d(applicationContext);
            vibrator = null;
            if (vibratorD != null) {
                if (!vibratorD.hasVibrator()) {
                    vibratorD = null;
                }
                if (vibratorD != null) {
                    f47745b = vibratorD;
                    return vibratorD;
                }
            }
        }
        return vibrator;
    }

    public final void b(Context context, a cue) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(cue, "cue");
        Vibrator vibratorF = f(context);
        if (vibratorF == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            vibratorF.vibrate(c(cue), e());
            return;
        }
        if (a(context)) {
            return;
        }
        if (i10 >= 29) {
            vibratorF.vibrate(c(cue));
        } else if (i10 >= 26) {
            vibratorF.vibrate(VibrationEffect.createOneShot(cue.g(), -1));
        } else {
            vibratorF.vibrate(cue.g());
        }
    }
}
