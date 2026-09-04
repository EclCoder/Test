package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.VungleError;
import com.vungle.ads.d0;
import com.vungle.ads.f0;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.y;
import fl.g0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g extends com.vungle.ads.internal.a {
    public static final a Companion = new a(null);
    private static final String TAG = "FullscreenAdInternal";
    private WeakReference<Context> playContext;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        private final com.vungle.ads.internal.model.b adPayload;
        private final Placement placement;
        private final com.vungle.ads.internal.presenter.n presenterDelegate;

        public b(com.vungle.ads.internal.model.b adPayload, Placement placement, com.vungle.ads.internal.presenter.n nVar) {
            s.h(adPayload, "adPayload");
            s.h(placement, "placement");
            this.adPayload = adPayload;
            this.placement = placement;
            this.presenterDelegate = nVar;
        }

        public static /* synthetic */ b copy$default(b bVar, com.vungle.ads.internal.model.b bVar2, Placement placement, com.vungle.ads.internal.presenter.n nVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar2 = bVar.adPayload;
            }
            if ((i10 & 2) != 0) {
                placement = bVar.placement;
            }
            if ((i10 & 4) != 0) {
                nVar = bVar.presenterDelegate;
            }
            return bVar.copy(bVar2, placement, nVar);
        }

        public final com.vungle.ads.internal.model.b component1() {
            return this.adPayload;
        }

        public final Placement component2() {
            return this.placement;
        }

        public final com.vungle.ads.internal.presenter.n component3() {
            return this.presenterDelegate;
        }

        public final b copy(com.vungle.ads.internal.model.b adPayload, Placement placement, com.vungle.ads.internal.presenter.n nVar) {
            s.h(adPayload, "adPayload");
            s.h(placement, "placement");
            return new b(adPayload, placement, nVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.c(this.adPayload, bVar.adPayload) && s.c(this.placement, bVar.placement) && s.c(this.presenterDelegate, bVar.presenterDelegate);
        }

        public final com.vungle.ads.internal.model.b getAdPayload() {
            return this.adPayload;
        }

        public final Placement getPlacement() {
            return this.placement;
        }

        public final com.vungle.ads.internal.presenter.n getPresenterDelegate() {
            return this.presenterDelegate;
        }

        public int hashCode() {
            int iHashCode = ((this.adPayload.hashCode() * 31) + this.placement.hashCode()) * 31;
            com.vungle.ads.internal.presenter.n nVar = this.presenterDelegate;
            return iHashCode + (nVar == null ? 0 : nVar.hashCode());
        }

        public String toString() {
            return "PendingData(adPayload=" + this.adPayload + ", placement=" + this.placement + ", presenterDelegate=" + this.presenterDelegate + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends t implements tl.a {
        final /* synthetic */ com.vungle.ads.internal.model.b $adv;
        final /* synthetic */ d $callbackWrapper;
        final /* synthetic */ Placement $pl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, com.vungle.ads.internal.model.b bVar, Placement placement) {
            super(0);
            this.$callbackWrapper = dVar;
            this.$adv = bVar;
            this.$pl = placement;
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m94invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m94invoke() throws Throwable {
            g.this.renderAd(this.$callbackWrapper, this.$adv, this.$pl);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends com.vungle.ads.internal.presenter.c {
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.vungle.ads.internal.presenter.b bVar, g gVar) {
            super(bVar);
            this.this$0 = gVar;
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdEnd(String str) {
            this.this$0.setAdState(com.vungle.ads.internal.a.EnumC0494a.FINISHED);
            super.onAdEnd(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdImpression(String str) {
            this.this$0.setAdState(com.vungle.ads.internal.a.EnumC0494a.IMPRESSION_LOGGED);
            super.onAdImpression(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onAdStart(String str) {
            this.this$0.setAdState(com.vungle.ads.internal.a.EnumC0494a.PLAYING);
            this.this$0.getValidationToPresentMetric$vungle_ads_release().markEnd();
            com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, this.this$0.getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            super.onAdStart(str);
        }

        @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
        public void onFailure(VungleError error) {
            s.h(error, "error");
            this.this$0.setAdState(com.vungle.ads.internal.a.EnumC0494a.ERROR);
            super.onFailure(error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        s.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderAd(com.vungle.ads.internal.presenter.b bVar, com.vungle.ads.internal.model.b bVar2, Placement placement) throws Throwable {
        Context context;
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = getContext();
        }
        s.g(context, "playContext?.get() ?: context");
        com.vungle.ads.internal.presenter.a aVar = new com.vungle.ads.internal.presenter.a(bVar, placement);
        b bVar3 = new b(bVar2, placement, getPresenterDelegate());
        com.vungle.ads.internal.ui.b.a aVar2 = com.vungle.ads.internal.ui.b.Companion;
        aVar2.setPendingData$vungle_ads_release(bVar3);
        aVar2.setEventListener$vungle_ads_release(aVar);
        Intent intentCreateIntent = aVar2.createIntent(context, placement.getReferenceId(), bVar2.eventId());
        com.vungle.ads.internal.util.a.C0535a c0535a = com.vungle.ads.internal.util.a.Companion;
        if (!c0535a.isForeground()) {
            com.vungle.ads.internal.util.q.Companion.d(TAG, "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            intentCreateIntent.putExtra(com.vungle.ads.internal.ui.b.AD_INVISIBLE_LOGGED_KEY, true);
            com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
            d0 d0Var = new d0(Sdk$SDKMetric.b.AD_VISIBILITY);
            d0Var.setValue(1L);
            com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, d0Var, getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        }
        getShowToValidationMetric$vungle_ads_release().markEnd();
        com.vungle.ads.g.logMetric$vungle_ads_release$default(com.vungle.ads.g.INSTANCE, getShowToValidationMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getValidationToPresentMetric$vungle_ads_release().markStart();
        c0535a.startWhenForeground(context, null, intentCreateIntent, null);
    }

    @Override // com.vungle.ads.internal.a
    public f0 getAdSizeForAdRequest() {
        return null;
    }

    public com.vungle.ads.internal.presenter.n getPresenterDelegate() {
        return null;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdSize(f0 f0Var) {
        return true;
    }

    public final void play(Context context, com.vungle.ads.internal.presenter.b adPlayCallback) {
        com.vungle.ads.internal.util.p logEntry$vungle_ads_release;
        Long adLoadType$vungle_ads_release;
        Long adLoadType$vungle_ads_release2;
        s.h(adPlayCallback, "adPlayCallback");
        com.vungle.ads.internal.util.p logEntry$vungle_ads_release2 = getLogEntry$vungle_ads_release();
        if ((logEntry$vungle_ads_release2 != null && (adLoadType$vungle_ads_release2 = logEntry$vungle_ads_release2.getAdLoadType$vungle_ads_release()) != null && adLoadType$vungle_ads_release2.longValue() == 3) || ((logEntry$vungle_ads_release = getLogEntry$vungle_ads_release()) != null && (adLoadType$vungle_ads_release = logEntry$vungle_ads_release.getAdLoadType$vungle_ads_release()) != null && adLoadType$vungle_ads_release.longValue() == 4)) {
            sendWinURL();
        }
        getShowToValidationMetric$vungle_ads_release().markStart();
        this.playContext = context != null ? new WeakReference<>(context) : null;
        VungleError vungleErrorCanPlayAd = canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            adPlayCallback.onFailure(vungleErrorCanPlayAd);
            if (isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                setAdState(com.vungle.ads.internal.a.EnumC0494a.ERROR);
                return;
            }
            return;
        }
        com.vungle.ads.internal.model.b advertisement = getAdvertisement();
        Placement placement = getPlacement();
        if (advertisement != null && placement != null) {
            d dVar = new d(adPlayCallback, this);
            cancelDownload$vungle_ads_release();
            y.INSTANCE.runOnUiThread(new c(dVar, advertisement, placement));
        } else {
            adPlayCallback.onFailure(new AdNotLoadedCantPlay("Ad or Placement is null: pl=" + placement + " adv=" + advertisement).setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }
    }
}
