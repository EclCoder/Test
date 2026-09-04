package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class RewardSignal extends BaseRewardSignal implements BaseIRewardCommunication {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f34710i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f34711h = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34713b;

        a(Object obj, String str) {
            this.f34712a = obj;
            this.f34713b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f34712a, this.f34713b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34716b;

        b(Object obj, String str) {
            this.f34715a = obj;
            this.f34716b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.install(this.f34715a, this.f34716b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34719b;

        c(Object obj, String str) {
            this.f34718a = obj;
            this.f34719b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.notifyCloseBtn(this.f34718a, this.f34719b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34722b;

        d(Object obj, String str) {
            this.f34721a = obj;
            this.f34722b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.toggleCloseBtn(this.f34721a, this.f34722b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34725b;

        e(Object obj, String str) {
            this.f34724a = obj;
            this.f34725b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f34724a, this.f34725b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34728b;

        f(Object obj, String str) {
            this.f34727a = obj;
            this.f34728b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.setOrientation(this.f34727a, this.f34728b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34731b;

        g(Object obj, String str) {
            this.f34730a = obj;
            this.f34731b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.handlerPlayableException(this.f34730a, this.f34731b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34734b;

        h(Object obj, String str) {
            this.f34733a = obj;
            this.f34734b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.openURL(this.f34733a, this.f34734b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        if (v0.h()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.f34711h.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        if (v0.h()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.f34711h.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        if (v0.h()) {
            super.install(obj, str);
        } else {
            this.f34711h.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f34711h.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        if (v0.h()) {
            super.openURL(obj, str);
        } else {
            this.f34711h.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        if (v0.h()) {
            super.setOrientation(obj, str);
        } else {
            this.f34711h.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f34711h.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f34711h.post(new e(obj, str));
        }
    }
}
