package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class VideoCommunication extends BaseVideoCommunication {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34736j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f34737i = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34739b;

        a(Object obj, String str) {
            this.f34738a = obj;
            this.f34739b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressBarOperate(this.f34738a, this.f34739b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34742b;

        a0(Object obj, String str) {
            this.f34741a = obj;
            this.f34742b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewRect(this.f34741a, this.f34742b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34745b;

        a1(Object obj, String str) {
            this.f34744a = obj;
            this.f34745b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUpdateFrame(this.f34744a, this.f34745b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34748b;

        a2(Object obj, String str) {
            this.f34747a = obj;
            this.f34748b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardUnitSetting(this.f34747a, this.f34748b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34751b;

        b(Object obj, String str) {
            this.f34750a = obj;
            this.f34751b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCurrentProgress(this.f34750a, this.f34751b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34754b;

        b0(Object obj, String str) {
            this.f34753a = obj;
            this.f34754b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeFromSuperView(this.f34753a, this.f34754b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34757b;

        b1(Object obj, String str) {
            this.f34756a = obj;
            this.f34757b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerMute(this.f34756a, this.f34757b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34760b;

        b2(Object obj, String str) {
            this.f34759a = obj;
            this.f34760b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getUnitSetting(this.f34759a, this.f34760b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34763b;

        c(Object obj, String str) {
            this.f34762a = obj;
            this.f34763b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoClickView(this.f34762a, this.f34763b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34766b;

        c0(Object obj, String str) {
            this.f34765a = obj;
            this.f34766b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendSubView(this.f34765a, this.f34766b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34769b;

        c1(Object obj, String str) {
            this.f34768a = obj;
            this.f34769b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoLocation(this.f34768a, this.f34769b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34772b;

        c2(Object obj, String str) {
            this.f34771a = obj;
            this.f34772b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getEncryptPrice(this.f34771a, this.f34772b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34775b;

        d(Object obj, String str) {
            this.f34774a = obj;
            this.f34775b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setScaleFitXY(this.f34774a, this.f34775b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34778b;

        d0(Object obj, String str) {
            this.f34777a = obj;
            this.f34778b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendViewTo(this.f34777a, this.f34778b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34781b;

        d1(Object obj, String str) {
            this.f34780a = obj;
            this.f34781b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUnmute(this.f34780a, this.f34781b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34784b;

        d2(Object obj, String str) {
            this.f34783a = obj;
            this.f34784b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeVideoOperte(this.f34783a, this.f34784b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34787b;

        e(Object obj, String str) {
            this.f34786a = obj;
            this.f34787b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.notifyCloseBtn(this.f34786a, this.f34787b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34790b;

        e0(Object obj, String str) {
            this.f34789a = obj;
            this.f34790b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendSubView(this.f34789a, this.f34790b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34793b;

        e1(Object obj, String str) {
            this.f34792a = obj;
            this.f34793b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerGetMuteState(this.f34792a, this.f34793b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34796b;

        e2(Object obj, String str) {
            this.f34795a = obj;
            this.f34796b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressOperate(this.f34795a, this.f34796b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34799b;

        f(Object obj, String str) {
            this.f34798a = obj;
            this.f34799b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.toggleCloseBtn(this.f34798a, this.f34799b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34802b;

        f0(Object obj, String str) {
            this.f34801a = obj;
            this.f34802b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendViewTo(this.f34801a, this.f34802b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34805b;

        f1(Object obj, String str) {
            this.f34804a = obj;
            this.f34805b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetSource(this.f34804a, this.f34805b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34808b;

        g(Object obj, String str) {
            this.f34807a = obj;
            this.f34808b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handlerH5Exception(this.f34807a, this.f34808b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34811b;

        g0(Object obj, String str) {
            this.f34810a = obj;
            this.f34811b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.statistics(this.f34810a, this.f34811b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34814b;

        g1(Object obj, String str) {
            this.f34813a = obj;
            this.f34814b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetRenderType(this.f34813a, this.f34814b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34817b;

        h(Object obj, String str) {
            this.f34816a = obj;
            this.f34817b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.isSystemResume(this.f34816a, this.f34817b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34820b;

        h0(Object obj, String str) {
            this.f34819a = obj;
            this.f34820b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.bringViewToFront(this.f34819a, this.f34820b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34823b;

        h1(Object obj, String str) {
            this.f34822a = obj;
            this.f34823b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.preloadSubPlayTemplateView(this.f34822a, this.f34823b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34826b;

        i(Object obj, String str) {
            this.f34825a = obj;
            this.f34826b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.readyStatus(this.f34825a, this.f34826b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34829b;

        i0(Object obj, String str) {
            this.f34828a = obj;
            this.f34829b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.hideView(this.f34828a, this.f34829b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34832b;

        i1(Object obj, String str) {
            this.f34831a = obj;
            this.f34832b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeAd(this.f34831a, this.f34832b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34835b;

        j(Object obj, String str) {
            this.f34834a = obj;
            this.f34835b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playVideoFinishOperate(this.f34834a, this.f34835b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34838b;

        j0(Object obj, String str) {
            this.f34837a = obj;
            this.f34838b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showView(this.f34837a, this.f34838b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34841b;

        j1(Object obj, String str) {
            this.f34840a = obj;
            this.f34841b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.broadcast(this.f34840a, this.f34841b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34844b;

        k(Object obj, String str) {
            this.f34843a = obj;
            this.f34844b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.init(this.f34843a, this.f34844b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34847b;

        k0(Object obj, String str) {
            this.f34846a = obj;
            this.f34847b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewBgColor(this.f34846a, this.f34847b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34850b;

        k1(Object obj, String str) {
            this.f34849a = obj;
            this.f34850b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.ivRewardAdsWithoutVideo(this.f34849a, this.f34850b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34853b;

        l(Object obj, String str) {
            this.f34852a = obj;
            this.f34853b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.openURL(this.f34852a, this.f34853b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34856b;

        l0(Object obj, String str) {
            this.f34855a = obj;
            this.f34856b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewAlpha(this.f34855a, this.f34856b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34859b;

        l1(Object obj, String str) {
            this.f34858a = obj;
            this.f34859b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setSubPlayTemplateInfo(this.f34858a, this.f34859b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34862b;

        m(Object obj, String str) {
            this.f34861a = obj;
            this.f34862b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showAlertView(this.f34861a, this.f34862b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34865b;

        m0(Object obj, String str) {
            this.f34864a = obj;
            this.f34865b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewScale(this.f34864a, this.f34865b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34868b;

        m1(Object obj, String str) {
            this.f34867a = obj;
            this.f34868b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewFireEvent(this.f34867a, this.f34868b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34871b;

        n(Object obj, String str) {
            this.f34870a = obj;
            this.f34871b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeWeb(this.f34870a, this.f34871b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class n0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34874b;

        n0(Object obj, String str) {
            this.f34873a = obj;
            this.f34874b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewAbove(this.f34873a, this.f34874b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class n1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34877b;

        n1(Object obj, String str) {
            this.f34876a = obj;
            this.f34877b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.soundOperate(this.f34876a, this.f34877b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34880b;

        o(Object obj, String str) {
            this.f34879a = obj;
            this.f34880b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getSDKInfo(this.f34879a, this.f34880b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class o0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34883b;

        o0(Object obj, String str) {
            this.f34882a = obj;
            this.f34883b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewBelow(this.f34882a, this.f34883b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class o1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34886b;

        o1(Object obj, String str) {
            this.f34885a = obj;
            this.f34886b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.increaseOfferFrequence(this.f34885a, this.f34886b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34889b;

        p(Object obj, String str) {
            this.f34888a = obj;
            this.f34889b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getFileInfo(this.f34888a, this.f34889b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class p0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34892b;

        p0(Object obj, String str) {
            this.f34891a = obj;
            this.f34892b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewAbove(this.f34891a, this.f34892b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class p1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34895b;

        p1(Object obj, String str) {
            this.f34894a = obj;
            this.f34895b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handleNativeObject(this.f34894a, this.f34895b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34898b;

        q(Object obj, String str) {
            this.f34897a = obj;
            this.f34898b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadads(this.f34897a, this.f34898b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class q0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34901b;

        q0(Object obj, String str) {
            this.f34900a = obj;
            this.f34901b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewBelow(this.f34900a, this.f34901b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class q1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34904b;

        q1(Object obj, String str) {
            this.f34903a = obj;
            this.f34904b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadingResourceStatus(this.f34903a, this.f34904b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34907b;

        r(Object obj, String str) {
            this.f34906a = obj;
            this.f34907b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reactDeveloper(this.f34906a, this.f34907b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class r0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34910b;

        r0(Object obj, String str) {
            this.f34909a = obj;
            this.f34910b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.triggerCloseBtn(this.f34909a, this.f34910b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class r1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34913b;

        r1(Object obj, String str) {
            this.f34912a = obj;
            this.f34913b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createNativeEC(this.f34912a, this.f34913b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34916b;

        s(Object obj, String str) {
            this.f34915a = obj;
            this.f34916b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reportUrls(this.f34915a, this.f34916b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class s0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34919b;

        s0(Object obj, String str) {
            this.f34918a = obj;
            this.f34919b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewLoad(this.f34918a, this.f34919b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class s1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34922b;

        s1(Object obj, String str) {
            this.f34921a = obj;
            this.f34922b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setCacheItem(this.f34921a, this.f34922b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34925b;

        t(Object obj, String str) {
            this.f34924a = obj;
            this.f34925b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createWebview(this.f34924a, this.f34925b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class t0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34928b;

        t0(Object obj, String str) {
            this.f34927a = obj;
            this.f34928b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewReload(this.f34927a, this.f34928b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class t1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34931b;

        t1(Object obj, String str) {
            this.f34930a = obj;
            this.f34931b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeCacheItem(this.f34930a, this.f34931b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class u implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34934b;

        u(Object obj, String str) {
            this.f34933a = obj;
            this.f34934b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createView(this.f34933a, this.f34934b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class u0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34937b;

        u0(Object obj, String str) {
            this.f34936a = obj;
            this.f34937b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoBack(this.f34936a, this.f34937b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class u1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34940b;

        u1(Object obj, String str) {
            this.f34939a = obj;
            this.f34940b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAllCache(this.f34939a, this.f34940b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class v implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34943b;

        v(Object obj, String str) {
            this.f34942a = obj;
            this.f34943b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.click(this.f34942a, this.f34943b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class v0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34946b;

        v0(Object obj, String str) {
            this.f34945a = obj;
            this.f34946b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoForward(this.f34945a, this.f34946b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class v1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34949b;

        v1(Object obj, String str) {
            this.f34948a = obj;
            this.f34949b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.clearAllCache(this.f34948a, this.f34949b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class w implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34952b;

        w(Object obj, String str) {
            this.f34951a = obj;
            this.f34952b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createPlayerView(this.f34951a, this.f34952b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class w0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34955b;

        w0(Object obj, String str) {
            this.f34954a = obj;
            this.f34955b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPlay(this.f34954a, this.f34955b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class w1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34958b;

        w1(Object obj, String str) {
            this.f34957a = obj;
            this.f34958b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCutout(this.f34957a, this.f34958b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class x implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34961b;

        x(Object obj, String str) {
            this.f34960a = obj;
            this.f34961b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createSubPlayTemplateView(this.f34960a, this.f34961b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class x0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34964b;

        x0(Object obj, String str) {
            this.f34963a = obj;
            this.f34964b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPause(this.f34963a, this.f34964b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class x1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34967b;

        x1(Object obj, String str) {
            this.f34966a = obj;
            this.f34967b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAppSetting(this.f34966a, this.f34967b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class y implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34970b;

        y(Object obj, String str) {
            this.f34969a = obj;
            this.f34970b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.destroyComponent(this.f34969a, this.f34970b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class y0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34973b;

        y0(Object obj, String str) {
            this.f34972a = obj;
            this.f34973b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerResume(this.f34972a, this.f34973b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class y1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34976b;

        y1(Object obj, String str) {
            this.f34975a = obj;
            this.f34976b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.videoOperate(this.f34975a, this.f34976b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class z implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34979b;

        z(Object obj, String str) {
            this.f34978a = obj;
            this.f34979b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getComponentOptions(this.f34978a, this.f34979b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class z0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34982b;

        z0(Object obj, String str) {
            this.f34981a = obj;
            this.f34982b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerStop(this.f34981a, this.f34982b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class z1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34985b;

        z1(Object obj, String str) {
            this.f34984a = obj;
            this.f34985b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardSetting(this.f34984a, this.f34985b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.appendSubView(obj, str);
        } else {
            this.f34737i.post(new c0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.appendViewTo(obj, str);
        } else {
            this.f34737i.post(new d0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.bringViewToFront(obj, str);
        } else {
            this.f34737i.post(new h0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.broadcast(obj, str);
        } else {
            this.f34737i.post(new j1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.clearAllCache(obj, str);
        } else {
            this.f34737i.post(new v1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.click(obj, str);
        } else {
            this.f34737i.post(new v(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeAd(obj, str);
        } else {
            this.f34737i.post(new i1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeVideoOperte(obj, str);
        } else {
            this.f34737i.post(new d2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeWeb(obj, str);
            return;
        }
        this.f34737i.post(new n(obj, str));
        com.mbridge.msdk.foundation.tools.q0.b("JS-Video-Brigde", "type" + str);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createNativeEC(obj, str);
        } else {
            this.f34737i.post(new r1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createPlayerView(obj, str);
        } else {
            this.f34737i.post(new w(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createSubPlayTemplateView(obj, str);
        } else {
            this.f34737i.post(new x(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createView(obj, str);
        } else {
            this.f34737i.post(new u(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createWebview(obj, str);
        } else {
            this.f34737i.post(new t(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.destroyComponent(obj, str);
        } else {
            this.f34737i.post(new y(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getAllCache(obj, str);
        } else {
            this.f34737i.post(new u1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getAppSetting(obj, str);
        } else {
            this.f34737i.post(new x1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getComponentOptions(obj, str);
        } else {
            this.f34737i.post(new z(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getCurrentProgress(obj, str);
        } else {
            this.f34737i.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getCutout(obj, str);
        } else {
            this.f34737i.post(new w1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getEncryptPrice(obj, str);
        } else {
            this.f34737i.post(new c2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getFileInfo(obj, str);
        } else {
            this.f34737i.post(new p(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getRewardSetting(obj, str);
        } else {
            this.f34737i.post(new z1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getRewardUnitSetting(obj, str);
        } else {
            this.f34737i.post(new a2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getSDKInfo(obj, str);
        } else {
            this.f34737i.post(new o(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getUnitSetting(obj, str);
        } else {
            this.f34737i.post(new b2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.handleNativeObject(obj, str);
        } else {
            this.f34737i.post(new p1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.handlerH5Exception(obj, str);
        } else {
            this.f34737i.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.hideView(obj, str);
        } else {
            this.f34737i.post(new i0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.increaseOfferFrequence(obj, str);
        } else {
            this.f34737i.post(new o1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.init(obj, str);
        } else {
            this.f34737i.post(new k(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.insertViewAbove(obj, str);
        } else {
            this.f34737i.post(new n0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.insertViewBelow(obj, str);
        } else {
            this.f34737i.post(new o0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.isSystemResume(obj, str);
        } else {
            this.f34737i.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.ivRewardAdsWithoutVideo(obj, str);
        } else {
            this.f34737i.post(new k1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.loadads(obj, str);
        } else {
            this.f34737i.post(new q(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.loadingResourceStatus(obj, str);
        } else {
            this.f34737i.post(new q1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f34737i.post(new e(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyAppendSubView(obj, str);
        } else {
            this.f34737i.post(new e0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyAppendViewTo(obj, str);
        } else {
            this.f34737i.post(new f0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyInsertViewAbove(obj, str);
        } else {
            this.f34737i.post(new p0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyInsertViewBelow(obj, str);
        } else {
            this.f34737i.post(new q0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.openURL(obj, str);
        } else {
            this.f34737i.post(new l(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playVideoFinishOperate(obj, str);
        } else {
            this.f34737i.post(new j(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerGetMuteState(obj, str);
        } else {
            this.f34737i.post(new e1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerMute(obj, str);
        } else {
            this.f34737i.post(new b1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerPause(obj, str);
        } else {
            this.f34737i.post(new x0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerPlay(obj, str);
        } else {
            this.f34737i.post(new w0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerResume(obj, str);
        } else {
            this.f34737i.post(new y0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerSetRenderType(obj, str);
        } else {
            this.f34737i.post(new g1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerSetSource(obj, str);
        } else {
            this.f34737i.post(new f1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerStop(obj, str);
        } else {
            this.f34737i.post(new z0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerUnmute(obj, str);
        } else {
            this.f34737i.post(new d1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerUpdateFrame(obj, str);
        } else {
            this.f34737i.post(new a1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.preloadSubPlayTemplateView(obj, str);
        } else {
            this.f34737i.post(new h1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.progressBarOperate(obj, str);
        } else {
            this.f34737i.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.progressOperate(obj, str);
        } else {
            this.f34737i.post(new e2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.reactDeveloper(obj, str);
        } else {
            this.f34737i.post(new r(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        com.mbridge.msdk.foundation.tools.q0.c("JS-Video-Brigde", "VIDEOBridge readyStatus");
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.readyStatus(obj, str);
        } else {
            this.f34737i.post(new i(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.removeCacheItem(obj, str);
        } else {
            this.f34737i.post(new t1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.removeFromSuperView(obj, str);
        } else {
            this.f34737i.post(new b0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.reportUrls(obj, str);
        } else {
            this.f34737i.post(new s(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setCacheItem(obj, str);
        } else {
            this.f34737i.post(new s1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setScaleFitXY(obj, str);
        } else {
            this.f34737i.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setSubPlayTemplateInfo(obj, str);
        } else {
            this.f34737i.post(new l1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewAlpha(obj, str);
        } else {
            this.f34737i.post(new l0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewBgColor(obj, str);
        } else {
            this.f34737i.post(new k0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewRect(obj, str);
        } else {
            this.f34737i.post(new a0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewScale(obj, str);
        } else {
            this.f34737i.post(new m0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showAlertView(obj, str);
        } else {
            this.f34737i.post(new m(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showVideoClickView(obj, str);
        } else {
            this.f34737i.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showVideoLocation(obj, str);
        } else {
            this.f34737i.post(new c1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showView(obj, str);
        } else {
            this.f34737i.post(new j0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.soundOperate(obj, str);
        } else {
            this.f34737i.post(new n1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.statistics(obj, str);
        } else {
            this.f34737i.post(new g0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f34737i.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f34737i.post(new r0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.videoOperate(obj, str);
        } else {
            this.f34737i.post(new y1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewFireEvent(obj, str);
        } else {
            this.f34737i.post(new m1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewGoBack(obj, str);
        } else {
            this.f34737i.post(new u0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewGoForward(obj, str);
        } else {
            this.f34737i.post(new v0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewLoad(obj, str);
        } else {
            this.f34737i.post(new s0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewReload(obj, str);
        } else {
            this.f34737i.post(new t0(obj, str));
        }
    }
}
