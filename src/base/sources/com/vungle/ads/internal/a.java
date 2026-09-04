package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.AdMarkupJsonError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.EmptyBidPayloadError;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.InvalidBannerSizeError;
import com.vungle.ads.InvalidCSBDataError;
import com.vungle.ads.PlacementAdTypeMismatchError;
import com.vungle.ads.PlacementNotFoundError;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.e0;
import com.vungle.ads.f0;
import com.vungle.ads.i0;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.y;
import fl.g0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements com.vungle.ads.internal.load.a {
    private static final long AD_LOAD_BIDDING = 2;
    public static final long AD_LOAD_POST_BID = 3;
    public static final long AD_LOAD_PRIORITY_ACCESS = 4;
    private static final long AD_LOAD_WATERFALL = 1;
    private static final int CSB_DATA_PHASE_PREBID = 2;
    private static final int MAX_CSB_STRING_LENGTH = 500;
    private static final int MAX_EXTRAS_ENTRIES = 50;
    private static final int MAX_EXTRAS_KEY_LENGTH = 100;
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private com.vungle.ads.internal.load.a adLoaderCallback;
    private volatile EnumC0494a adState;
    private com.vungle.ads.internal.model.b advertisement;
    private com.vungle.ads.internal.load.d baseAdLoader;
    private BidPayload bidPayload;
    private final Context context;
    private e0 loadMetric;
    private com.vungle.ads.internal.util.p logEntry;
    private final AtomicBoolean lossUrlSent;
    private Placement placement;
    private e0 requestMetric;
    private final y showToValidationMetric;
    private final y validationToPresentMetric;
    private final fl.k vungleApiClient$delegate;
    private final AtomicBoolean winUrlSent;
    public static final c Companion = new c(null);
    private static final kotlinx.serialization.json.b json = v.b(null, b.INSTANCE, 1, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.vungle.ads.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class EnumC0494a {
        public static final EnumC0494a NEW = new e("NEW", 0);
        public static final EnumC0494a LOADING = new d("LOADING", 1);
        public static final EnumC0494a READY = new g("READY", 2);
        public static final EnumC0494a PLAYING = new f("PLAYING", 3);
        public static final EnumC0494a IMPRESSION_LOGGED = new c("IMPRESSION_LOGGED", 4);
        public static final EnumC0494a FINISHED = new b("FINISHED", 5);
        public static final EnumC0494a ERROR = new C0495a("ERROR", 6);
        private static final /* synthetic */ EnumC0494a[] $VALUES = $values();

        /* JADX INFO: renamed from: com.vungle.ads.internal.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0495a extends EnumC0494a {
            C0495a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0494a
            public boolean canTransitionTo(EnumC0494a adState) {
                s.h(adState, "adState");
                return adState == EnumC0494a.FINISHED;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "failed";
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class b extends EnumC0494a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0494a
            public boolean canTransitionTo(EnumC0494a adState) {
                s.h(adState, "adState");
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "completed";
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.a$a$c */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class c extends EnumC0494a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0494a
            public boolean canTransitionTo(EnumC0494a adState) {
                s.h(adState, "adState");
                return adState == EnumC0494a.FINISHED || adState == EnumC0494a.ERROR || adState == EnumC0494a.READY;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "impressionLogged";
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.a$a$d */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class d extends EnumC0494a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0494a
            public boolean canTransitionTo(EnumC0494a adState) {
                s.h(adState, "adState");
                return adState == EnumC0494a.READY || adState == EnumC0494a.ERROR;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "loading";
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.a$a$e */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class e extends EnumC0494a {
            e(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0494a
            public boolean canTransitionTo(EnumC0494a adState) {
                s.h(adState, "adState");
                return adState == EnumC0494a.LOADING || adState == EnumC0494a.READY || adState == EnumC0494a.ERROR;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "idle";
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.a$a$f */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class f extends EnumC0494a {
            f(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0494a
            public boolean canTransitionTo(EnumC0494a adState) {
                s.h(adState, "adState");
                return adState == EnumC0494a.IMPRESSION_LOGGED || adState == EnumC0494a.FINISHED || adState == EnumC0494a.ERROR || adState == EnumC0494a.READY;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "playing";
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.a$a$g */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class g extends EnumC0494a {
            g(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.a.EnumC0494a
            public boolean canTransitionTo(EnumC0494a adState) {
                s.h(adState, "adState");
                return adState == EnumC0494a.PLAYING || adState == EnumC0494a.FINISHED || adState == EnumC0494a.ERROR;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "ready";
            }
        }

        private static final /* synthetic */ EnumC0494a[] $values() {
            return new EnumC0494a[]{NEW, LOADING, READY, PLAYING, IMPRESSION_LOGGED, FINISHED, ERROR};
        }

        public /* synthetic */ EnumC0494a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static EnumC0494a valueOf(String str) {
            return (EnumC0494a) Enum.valueOf(EnumC0494a.class, str);
        }

        public static EnumC0494a[] values() {
            return (EnumC0494a[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(EnumC0494a enumC0494a);

        public final boolean isTerminalState() {
            return gl.r.o(FINISHED, ERROR).contains(this);
        }

        public final EnumC0494a transitionTo(EnumC0494a adState) {
            s.h(adState, "adState");
            if (this == adState || canTransitionTo(adState)) {
                return adState;
            }
            String str = "Cannot transition from " + name() + " to " + adState.name();
            if (a.THROW_ON_ILLEGAL_TRANSITION) {
                throw new IllegalStateException(str);
            }
            com.vungle.ads.internal.util.q.Companion.e(a.TAG, "Illegal state transition", new IllegalStateException(str));
            return adState;
        }

        private EnumC0494a(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements Function1 {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((kotlinx.serialization.json.e) obj);
            return g0.f38750a;
        }

        public final void invoke(kotlinx.serialization.json.e Json) {
            s.h(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }

        private static /* synthetic */ void getJson$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0494a.values().length];
            iArr[EnumC0494a.NEW.ordinal()] = 1;
            iArr[EnumC0494a.LOADING.ordinal()] = 2;
            iArr[EnumC0494a.READY.ordinal()] = 3;
            iArr[EnumC0494a.PLAYING.ordinal()] = 4;
            iArr[EnumC0494a.IMPRESSION_LOGGED.ordinal()] = 5;
            iArr[EnumC0494a.FINISHED.ordinal()] = 6;
            iArr[EnumC0494a.ERROR.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.f, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.task.f invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.task.f.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.c, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.omsdk.c invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.omsdk.c.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.d, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.executor.d invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.d.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.s, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.util.s invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.s.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.downloader.Downloader, java.lang.Object] */
        @Override // tl.a
        public final Downloader invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(Downloader.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class j extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.i, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.i invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.i.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class k extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.i, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.i invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.i.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class l extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.i, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.i invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.i.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class m extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.k, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.k invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.k.class);
        }
    }

    public a(Context context) {
        s.h(context, "context");
        this.context = context;
        this.adState = EnumC0494a.NEW;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.vungleApiClient$delegate = fl.l.a(fl.o.SYNCHRONIZED, new m(context));
        this.showToValidationMetric = new y(Sdk$SDKMetric.b.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.validationToPresentMetric = new y(Sdk$SDKMetric.b.AD_VALIDATION_TO_PRESENT_DURATION_MS);
        this.winUrlSent = new AtomicBoolean(false);
        this.lossUrlSent = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.task.f m66_set_adState_$lambda1$lambda0(fl.k kVar) {
        return (com.vungle.ads.internal.task.f) kVar.getValue();
    }

    public static /* synthetic */ VungleError canPlayAd$default(a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return aVar.canPlayAd(z10);
    }

    private final com.vungle.ads.internal.network.k getVungleApiClient() {
        return (com.vungle.ads.internal.network.k) this.vungleApiClient$delegate.getValue();
    }

    public static /* synthetic */ void loadAd$default(a aVar, String str, String str2, i0 i0Var, com.vungle.ads.internal.load.a aVar2, int i10, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAd");
        }
        if ((i10 & 4) != 0) {
            i0Var = null;
        }
        aVar.loadAd(str, str2, i0Var, aVar2);
    }

    /* JADX INFO: renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.omsdk.c m67loadAd$lambda2(fl.k kVar) {
        return (com.vungle.ads.internal.omsdk.c) kVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.d m68loadAd$lambda3(fl.k kVar) {
        return (com.vungle.ads.internal.executor.d) kVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.util.s m69loadAd$lambda4(fl.k kVar) {
        return (com.vungle.ads.internal.util.s) kVar.getValue();
    }

    /* JADX INFO: renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final Downloader m70loadAd$lambda5(fl.k kVar) {
        return (Downloader) kVar.getValue();
    }

    /* JADX INFO: renamed from: onSuccess$lambda-9$lambda-7, reason: not valid java name */
    private static final com.vungle.ads.internal.network.i m71onSuccess$lambda9$lambda7(fl.k kVar) {
        return (com.vungle.ads.internal.network.i) kVar.getValue();
    }

    /* JADX INFO: renamed from: sendLossURL$lambda-13, reason: not valid java name */
    private static final com.vungle.ads.internal.network.i m72sendLossURL$lambda13(fl.k kVar) {
        return (com.vungle.ads.internal.network.i) kVar.getValue();
    }

    /* JADX INFO: renamed from: sendWinURL$lambda-11, reason: not valid java name */
    private static final com.vungle.ads.internal.network.i m73sendWinURL$lambda11(fl.k kVar) {
        return (com.vungle.ads.internal.network.i) kVar.getValue();
    }

    private final VungleError validateBidFloor(double d10) {
        if (d10 >= 0.0d) {
            return null;
        }
        return new InvalidCSBDataError("bidFloor must be >= 0, got: " + d10);
    }

    private final VungleError validateCSBData(i0 i0Var) {
        VungleError vungleErrorValidateBidFloor = validateBidFloor(i0Var.getBidFloor());
        return (vungleErrorValidateBidFloor == null && (vungleErrorValidateBidFloor = validatePhase(i0Var.getPhase())) == null && (vungleErrorValidateBidFloor = validateStringFields(i0Var)) == null) ? validateExtras(i0Var.getExtras()) : vungleErrorValidateBidFloor;
    }

    private final VungleError validateExtras(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.size() <= 50) {
            return validateExtrasEntries(map);
        }
        return new InvalidCSBDataError("extras map exceeds maximum of 50 entries, got: " + map.size());
    }

    private final VungleError validateExtrasEntries(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.length() == 0) {
                return new InvalidCSBDataError("extras contains empty key");
            }
            if (key.length() > 100) {
                return new InvalidCSBDataError("extras key exceeds maximum length of 100: " + key);
            }
            if (value.length() > 500) {
                return new InvalidCSBDataError("extras value for key '" + key + "' exceeds maximum length of 500");
            }
        }
        return null;
    }

    private final VungleError validatePhase(int i10) {
        if (1 <= i10 && i10 < 3) {
            return null;
        }
        return new InvalidCSBDataError("phase must be 1 or 2, got: " + i10);
    }

    private final VungleError validateStringFields(i0 i0Var) {
        VungleError vungleErrorValidateStringLength = validateStringLength(i0Var.getAuctionId(), 500, "auctionId");
        return (vungleErrorValidateStringLength == null && (vungleErrorValidateStringLength = validateStringLength(i0Var.getCreativeId(), 500, "creativeId")) == null) ? validateStringLength(i0Var.getAdUnitId(), 500, "adUnitId") : vungleErrorValidateStringLength;
    }

    private final VungleError validateStringLength(String str, int i10, String str2) {
        if (str.length() <= i10) {
            return null;
        }
        return new InvalidCSBDataError(str2 + " exceeds maximum length of " + i10);
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(com.vungle.ads.internal.model.b advertisement) {
        s.h(advertisement, "advertisement");
    }

    public final VungleError canPlayAd(boolean z10) {
        com.vungle.ads.internal.model.b.c cVarAdUnit;
        VungleError vungleErrorIsAdStateValidOnCanPlay = isAdStateValidOnCanPlay();
        com.vungle.ads.internal.model.b bVar = this.advertisement;
        if (bVar == null) {
            vungleErrorIsAdStateValidOnCanPlay = new AdNotLoadedCantPlay("adv is null on onPlay=" + z10);
        } else if (vungleErrorIsAdStateValidOnCanPlay == null) {
            Integer expiry = null;
            if (bVar == null || !bVar.hasExpired()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ad expiry: ");
            com.vungle.ads.internal.model.b bVar2 = this.advertisement;
            if (bVar2 != null && (cVarAdUnit = bVar2.adUnit()) != null) {
                expiry = cVarAdUnit.getExpiry();
            }
            sb2.append(expiry);
            sb2.append(", device: ");
            sb2.append(System.currentTimeMillis());
            String string = sb2.toString();
            vungleErrorIsAdStateValidOnCanPlay = z10 ? new AdExpiredOnPlayError(string) : new AdExpiredError(string);
        }
        if (z10) {
            vungleErrorIsAdStateValidOnCanPlay.setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
        return vungleErrorIsAdStateValidOnCanPlay;
    }

    public final void cancelDownload$vungle_ads_release() {
        com.vungle.ads.internal.model.b bVar = this.advertisement;
        if (bVar != null && bVar.isPartialDownloadEnabled()) {
            com.vungle.ads.internal.util.q.Companion.d(TAG, "Skip cancelling download for ads with partial download enabled.");
            return;
        }
        com.vungle.ads.internal.load.d dVar = this.baseAdLoader;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    public abstract f0 getAdSizeForAdRequest();

    public final EnumC0494a getAdState() {
        return this.adState;
    }

    public final com.vungle.ads.internal.model.b getAdvertisement() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.util.p getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final y getShowToValidationMetric$vungle_ads_release() {
        return this.showToValidationMetric;
    }

    public final y getValidationToPresentMetric$vungle_ads_release() {
        return this.validationToPresentMetric;
    }

    public final boolean isAdPlaying$vungle_ads_release() {
        return this.adState == EnumC0494a.PLAYING || this.adState == EnumC0494a.IMPRESSION_LOGGED;
    }

    public VungleError isAdStateValidOnCanPlay() {
        if (this.adState == EnumC0494a.PLAYING) {
            return new InvalidAdStateError(Sdk$SDKError.b.AD_IS_PLAYING, "Current ad is playing");
        }
        if (this.adState == EnumC0494a.IMPRESSION_LOGGED) {
            return new InvalidAdStateError(Sdk$SDKError.b.AD_IS_PLAYING, "Current ad is playing, impression logged");
        }
        if (this.adState == EnumC0494a.READY) {
            return null;
        }
        return new InvalidAdStateError(Sdk$SDKError.b.AD_NOT_LOADED, this.adState + " is not READY");
    }

    public final boolean isErrorTerminal$vungle_ads_release(int i10) {
        return this.adState == EnumC0494a.READY && i10 == 304;
    }

    public abstract boolean isValidAdSize(f0 f0Var);

    public abstract boolean isValidAdTypeForPlacement(Placement kVar);

    public final void loadAd(String placementId, String str, i0 i0Var, com.vungle.ads.internal.load.a adLoaderCallback) throws Throwable {
        Sdk$SDKError.b bVar;
        s.h(placementId, "placementId");
        s.h(adLoaderCallback, "adLoaderCallback");
        com.vungle.ads.internal.util.p pVar = this.logEntry;
        if (pVar != null) {
            pVar.setAdState$vungle_ads_release(this.adState);
        }
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, Sdk$SDKMetric.b.LOAD_AD_API, 0L, this.logEntry, null, 10, null);
        e0 e0Var = new e0(Sdk$SDKMetric.b.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.loadMetric = e0Var;
        e0Var.markStart();
        this.adLoaderCallback = adLoaderCallback;
        if (!com.vungle.ads.g0.Companion.isInitialized()) {
            adLoaderCallback.onFailure(new SdkNotInitialized("SDK not initialized").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.e eVar = com.vungle.ads.internal.e.INSTANCE;
        Placement placement = eVar.getPlacement(placementId);
        if (placement != null) {
            this.placement = placement;
            if (!isValidAdTypeForPlacement(placement)) {
                adLoaderCallback.onFailure(new PlacementAdTypeMismatchError(placement.getReferenceId()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } else if (placement.getHeaderBidding() && (str == null || str.length() == 0)) {
                adLoaderCallback.onFailure(new EmptyBidPayloadError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        } else if (eVar.configLastValidatedTimestamp() != -1) {
            adLoaderCallback.onFailure(new PlacementNotFoundError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        } else {
            Placement kVar = new Placement(placementId, false, (String) null, 6, (DefaultConstructorMarker) null);
            this.placement = kVar;
            placement = kVar;
        }
        f0 adSizeForAdRequest = getAdSizeForAdRequest();
        if (!isValidAdSize(adSizeForAdRequest)) {
            adLoaderCallback.onFailure(new InvalidBannerSizeError(adSizeForAdRequest != null ? adSizeForAdRequest.toString() : null).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        if (this.adState != EnumC0494a.NEW) {
            switch (d.$EnumSwitchMapping$0[this.adState.ordinal()]) {
                case 1:
                    throw new fl.p(null, 1, null);
                case 2:
                    bVar = Sdk$SDKError.b.AD_IS_LOADING;
                    break;
                case 3:
                    bVar = Sdk$SDKError.b.AD_ALREADY_LOADED;
                    break;
                case 4:
                    bVar = Sdk$SDKError.b.AD_IS_PLAYING;
                    break;
                case 5:
                    bVar = Sdk$SDKError.b.AD_IS_PLAYING;
                    break;
                case 6:
                    bVar = Sdk$SDKError.b.AD_CONSUMED;
                    break;
                case 7:
                    bVar = Sdk$SDKError.b.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            adLoaderCallback.onFailure(new InvalidAdStateError(bVar, this.adState + " state is incorrect for load").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        e0 e0Var2 = new e0(Sdk$SDKMetric.b.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.requestMetric = e0Var2;
        e0Var2.markStart();
        if (str != null && str.length() != 0) {
            try {
                kotlinx.serialization.json.b bVar2 = json;
                pm.d dVarB = pm.t.b(bVar2.a(), l0.k(BidPayload.class));
                s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.bidPayload = (BidPayload) bVar2.b(dVarB, str);
            } catch (IllegalArgumentException e10) {
                adLoaderCallback.onFailure(new AdMarkupInvalidError("Unable to decode payload into BidPayload object. Error: " + e10.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } catch (Throwable th2) {
                adLoaderCallback.onFailure(new AdMarkupJsonError(th2.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        }
        setAdState(EnumC0494a.LOADING);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = this.context;
        fl.o oVar = fl.o.SYNCHRONIZED;
        fl.k kVarA = fl.l.a(oVar, new f(context));
        fl.k kVarA2 = fl.l.a(oVar, new g(this.context));
        fl.k kVarA3 = fl.l.a(oVar, new h(this.context));
        fl.k kVarA4 = fl.l.a(oVar, new i(this.context));
        if (i0Var != null) {
            VungleError vungleErrorValidateCSBData = validateCSBData(i0Var);
            if (vungleErrorValidateCSBData != null) {
                adLoaderCallback.onFailure(vungleErrorValidateCSBData.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
            com.vungle.ads.internal.util.p pVar2 = this.logEntry;
            if (pVar2 != null) {
                pVar2.setAdLoadType$vungle_ads_release(i0Var.getPhase() == 2 ? 4L : 3L);
            }
            this.baseAdLoader = new com.vungle.ads.internal.load.h(this.context, getVungleApiClient(), m68loadAd$lambda3(kVarA2), m67loadAd$lambda2(kVarA), m70loadAd$lambda5(kVarA4), m69loadAd$lambda4(kVarA3), new com.vungle.ads.internal.load.b(placement, null, adSizeForAdRequest, i0Var));
        } else if (str == null || str.length() == 0) {
            com.vungle.ads.internal.util.p pVar3 = this.logEntry;
            if (pVar3 != null) {
                pVar3.setAdLoadType$vungle_ads_release(1L);
            }
            this.baseAdLoader = new com.vungle.ads.internal.load.k(this.context, getVungleApiClient(), m68loadAd$lambda3(kVarA2), m67loadAd$lambda2(kVarA), m70loadAd$lambda5(kVarA4), m69loadAd$lambda4(kVarA3), new com.vungle.ads.internal.load.b(placement, null, adSizeForAdRequest, null));
        } else {
            com.vungle.ads.internal.util.p pVar4 = this.logEntry;
            if (pVar4 != null) {
                pVar4.setAdLoadType$vungle_ads_release(2L);
            }
            this.baseAdLoader = new com.vungle.ads.internal.load.m(this.context, getVungleApiClient(), m68loadAd$lambda3(kVarA2), m67loadAd$lambda2(kVarA), m70loadAd$lambda5(kVarA4), m69loadAd$lambda4(kVarA3), new com.vungle.ads.internal.load.b(placement, this.bidPayload, adSizeForAdRequest, null));
        }
        com.vungle.ads.internal.load.d dVar = this.baseAdLoader;
        if (dVar != null) {
            dVar.setLogEntry$vungle_ads_release(this.logEntry);
        }
        com.vungle.ads.internal.load.d dVar2 = this.baseAdLoader;
        if (dVar2 != null) {
            dVar2.loadAd(this);
        }
    }

    public void onAdLoaded$vungle_ads_release(com.vungle.ads.internal.model.b advertisement) {
        s.h(advertisement, "advertisement");
    }

    @Override // com.vungle.ads.internal.load.a
    public void onFailure(VungleError error) throws Throwable {
        s.h(error, "error");
        setAdState(EnumC0494a.ERROR);
        e0 e0Var = this.loadMetric;
        if (e0Var != null) {
            e0Var.setMetricType(Sdk$SDKMetric.b.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            e0Var.markEnd();
            com.vungle.ads.g.INSTANCE.logMetric$vungle_ads_release(e0Var, this.logEntry, error.getCode() + '-' + error.getErrorMessage());
        }
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.a
    public void onSuccess(com.vungle.ads.internal.model.b advertisement) throws Throwable {
        s.h(advertisement, "advertisement");
        this.advertisement = advertisement;
        setAdState(EnumC0494a.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        onAdLoaded$vungle_ads_release(advertisement);
        com.vungle.ads.internal.load.a aVar = this.adLoaderCallback;
        if (aVar != null) {
            aVar.onSuccess(advertisement);
        }
        e0 e0Var = this.loadMetric;
        if (e0Var != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                e0Var.setMetricType(Sdk$SDKMetric.b.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            e0Var.markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, e0Var, this.logEntry, (String) null, 4, (Object) null);
        }
        e0 e0Var2 = this.requestMetric;
        if (e0Var2 != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                e0Var2.setMetricType(Sdk$SDKMetric.b.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            e0Var2.markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, e0Var2, this.logEntry, (String) null, 4, (Object) null);
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            fl.k kVarA = fl.l.a(fl.o.SYNCHRONIZED, new j(this.context));
            List tpatUrls$default = com.vungle.ads.internal.model.b.getTpatUrls$default(advertisement, com.vungle.ads.internal.f.AD_LOAD_DURATION, String.valueOf(e0Var2.getValue()), null, 4, null);
            if (tpatUrls$default != null) {
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.i.sendTpat$default(m71onSuccess$lambda9$lambda7(kVarA), new com.vungle.ads.internal.network.g.a((String) it.next()).tpatKey(com.vungle.ads.internal.f.AD_LOAD_DURATION).withLogEntry(this.logEntry).build(), false, 2, null);
                }
            }
        }
    }

    public final void sendLossURL() {
        List<String> lossUrls;
        if (!this.lossUrlSent.compareAndSet(false, true)) {
            com.vungle.ads.internal.util.q.Companion.d(TAG, "Loss URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.b bVar = this.advertisement;
        if (bVar == null || (lossUrls = bVar.getLossUrls()) == null) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        fl.k kVarA = fl.l.a(fl.o.SYNCHRONIZED, new k(this.context));
        for (String str : lossUrls) {
            if (com.vungle.ads.internal.util.j.INSTANCE.isValidUrl(str)) {
                com.vungle.ads.internal.network.i.sendTpat$default(m72sendLossURL$lambda13(kVarA), new com.vungle.ads.internal.network.g.a(str).priorityRetry(true).build(), false, 2, null);
            } else {
                com.vungle.ads.internal.util.q.Companion.w(TAG, "Invalid loss URL skipped: " + str);
            }
        }
    }

    public final void sendWinURL() {
        List<String> winUrls;
        if (!this.winUrlSent.compareAndSet(false, true)) {
            com.vungle.ads.internal.util.q.Companion.d(TAG, "Win URL already sent, skipping");
            return;
        }
        com.vungle.ads.internal.model.b bVar = this.advertisement;
        if (bVar == null || (winUrls = bVar.getWinUrls()) == null) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        fl.k kVarA = fl.l.a(fl.o.SYNCHRONIZED, new l(this.context));
        for (String str : winUrls) {
            if (com.vungle.ads.internal.util.j.INSTANCE.isValidUrl(str)) {
                com.vungle.ads.internal.network.i.sendTpat$default(m73sendWinURL$lambda11(kVarA), new com.vungle.ads.internal.network.g.a(str).priorityRetry(true).build(), false, 2, null);
            } else {
                com.vungle.ads.internal.util.q.Companion.w(TAG, "Invalid win URL skipped: " + str);
            }
        }
    }

    public final void setAdState(EnumC0494a value) {
        com.vungle.ads.internal.model.b bVar;
        String strEventId;
        s.h(value, "value");
        if (value.isTerminalState() && (bVar = this.advertisement) != null && (strEventId = bVar.eventId()) != null) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            m66_set_adState_$lambda1$lambda0(fl.l.a(fl.o.SYNCHRONIZED, new e(this.context))).execute(com.vungle.ads.internal.task.a.Companion.makeJobInfo(strEventId));
        }
        this.adState = this.adState.transitionTo(value);
        com.vungle.ads.internal.util.p pVar = this.logEntry;
        if (pVar == null) {
            return;
        }
        pVar.setAdState$vungle_ads_release(this.adState);
    }

    public final void setAdvertisement(com.vungle.ads.internal.model.b bVar) {
        this.advertisement = bVar;
    }

    public final void setLogEntry$vungle_ads_release(com.vungle.ads.internal.util.p pVar) {
        this.logEntry = pVar;
    }

    public final void setPlacement(Placement kVar) {
        this.placement = kVar;
    }
}
