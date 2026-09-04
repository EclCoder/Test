package q8;

import android.content.Context;
import android.view.ViewGroup;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f50425a = new f();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements q8.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBBidNewInterstitialHandler f50426a;

        a() {
        }

        @Override // q8.c
        public void a(Context context, String placementId, String adUnitId) {
            s.h(context, "context");
            s.h(placementId, "placementId");
            s.h(adUnitId, "adUnitId");
            this.f50426a = new MBBidNewInterstitialHandler(context, placementId, adUnitId);
        }

        @Override // q8.c
        public void b(NewInterstitialWithCodeListener listener) {
            s.h(listener, "listener");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f50426a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setInterstitialVideoListener(listener);
            }
        }

        @Override // q8.c
        public void loadFromBid(String bidToken) {
            s.h(bidToken, "bidToken");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f50426a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.loadFromBid(bidToken);
            }
        }

        @Override // q8.c
        public void playVideoMute(int i10) {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f50426a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.playVideoMute(i10);
            }
        }

        @Override // q8.c
        public void setExtraInfo(JSONObject jsonObject) {
            s.h(jsonObject, "jsonObject");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f50426a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setExtraInfo(jsonObject);
            }
        }

        @Override // q8.c
        public void showFromBid() {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f50426a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.showFromBid();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBNewInterstitialHandler f50427a;

        b() {
        }

        @Override // q8.h
        public void a(Context context, String placementId, String adUnitId) {
            s.h(context, "context");
            s.h(placementId, "placementId");
            s.h(adUnitId, "adUnitId");
            this.f50427a = new MBNewInterstitialHandler(context, placementId, adUnitId);
        }

        @Override // q8.h
        public void b(NewInterstitialWithCodeListener listener) {
            s.h(listener, "listener");
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f50427a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.setInterstitialVideoListener(listener);
            }
        }

        @Override // q8.h
        public void load() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f50427a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.load();
            }
        }

        @Override // q8.h
        public void playVideoMute(int i10) {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f50427a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.playVideoMute(i10);
            }
        }

        @Override // q8.h
        public void show() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f50427a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.show();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements q8.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBBidRewardVideoHandler f50428a;

        c() {
        }

        @Override // q8.d
        public void a(Context context, String placementId, String adUnitId) {
            s.h(context, "context");
            s.h(placementId, "placementId");
            s.h(adUnitId, "adUnitId");
            this.f50428a = new MBBidRewardVideoHandler(context, placementId, adUnitId);
        }

        @Override // q8.d
        public void b(RewardVideoWithCodeListener listener) {
            s.h(listener, "listener");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f50428a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.setRewardVideoListener(listener);
            }
        }

        @Override // q8.d
        public void loadFromBid(String bidToken) {
            s.h(bidToken, "bidToken");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f50428a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.loadFromBid(bidToken);
            }
        }

        @Override // q8.d
        public void playVideoMute(int i10) {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f50428a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.playVideoMute(i10);
            }
        }

        @Override // q8.d
        public void setExtraInfo(JSONObject jsonObject) {
            s.h(jsonObject, "jsonObject");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f50428a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.setExtraInfo(jsonObject);
            }
        }

        @Override // q8.d
        public void showFromBid() {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f50428a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.showFromBid();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBRewardVideoHandler f50429a;

        d() {
        }

        @Override // q8.i
        public void a(Context context, String placementId, String adUnitId) {
            s.h(context, "context");
            s.h(placementId, "placementId");
            s.h(adUnitId, "adUnitId");
            this.f50429a = new MBRewardVideoHandler(context, placementId, adUnitId);
        }

        @Override // q8.i
        public void b(RewardVideoWithCodeListener listener) {
            s.h(listener, "listener");
            MBRewardVideoHandler mBRewardVideoHandler = this.f50429a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.setRewardVideoListener(listener);
            }
        }

        @Override // q8.i
        public void load() {
            MBRewardVideoHandler mBRewardVideoHandler = this.f50429a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.load();
            }
        }

        @Override // q8.i
        public void playVideoMute(int i10) {
            MBRewardVideoHandler mBRewardVideoHandler = this.f50429a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.playVideoMute(i10);
            }
        }

        @Override // q8.i
        public void show() {
            MBRewardVideoHandler mBRewardVideoHandler = this.f50429a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.show();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBSplashHandler f50430a;

        e() {
        }

        @Override // q8.k
        public void a() {
            MBSplashHandler mBSplashHandler = this.f50430a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoad();
            }
        }

        @Override // q8.k
        public void b(ViewGroup group, String bidToken) {
            s.h(group, "group");
            s.h(bidToken, "bidToken");
            MBSplashHandler mBSplashHandler = this.f50430a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(group, bidToken);
            }
        }

        @Override // q8.k
        public void c(String token) {
            s.h(token, "token");
            MBSplashHandler mBSplashHandler = this.f50430a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoadByToken(token);
            }
        }

        @Override // q8.k
        public void d(String placementId, String adUnitId) {
            s.h(placementId, "placementId");
            s.h(adUnitId, "adUnitId");
            this.f50430a = new MBSplashHandler(placementId, adUnitId, true, 5);
        }

        @Override // q8.k
        public void e(MBSplashLoadWithCodeListener listener) {
            s.h(listener, "listener");
            MBSplashHandler mBSplashHandler = this.f50430a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashLoadListener(listener);
            }
        }

        @Override // q8.k
        public void f(MBSplashShowListener listener) {
            s.h(listener, "listener");
            MBSplashHandler mBSplashHandler = this.f50430a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashShowListener(listener);
            }
        }

        @Override // q8.k
        public void g(ViewGroup group) {
            s.h(group, "group");
            MBSplashHandler mBSplashHandler = this.f50430a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(group);
            }
        }

        @Override // q8.k
        public void onDestroy() {
            MBSplashHandler mBSplashHandler = this.f50430a;
            if (mBSplashHandler != null) {
                mBSplashHandler.onDestroy();
            }
        }

        @Override // q8.k
        public void setExtraInfo(JSONObject jsonObject) {
            s.h(jsonObject, "jsonObject");
            MBSplashHandler mBSplashHandler = this.f50430a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setExtraInfo(jsonObject);
            }
        }
    }

    private f() {
    }

    public static final q8.c a() {
        return new a();
    }

    public static final h b() {
        return new b();
    }

    public static final MBBannerView c(Context context) {
        s.h(context, "context");
        return new MBBannerView(context);
    }

    public static final q8.d d() {
        return new c();
    }

    public static final i e() {
        return new d();
    }

    public static final k f() {
        return new e();
    }
}
