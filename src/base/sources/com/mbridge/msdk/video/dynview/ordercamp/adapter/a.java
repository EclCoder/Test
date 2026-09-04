package com.mbridge.msdk.video.dynview.ordercamp.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f34251a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f34252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f34253c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ordercamp.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0466a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f34254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34255b;

        C0466a(ImageView imageView, boolean z10) {
            this.f34254a = imageView;
            this.f34255b = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (this.f34255b) {
                this.f34254a.setVisibility(8);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                this.f34254a.setImageBitmap(bitmap);
            } catch (Throwable th2) {
                q0.b("OrderCampAdapter", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f34257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MBRotationView f34258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        MBridgeImageView f34259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RoundImageView f34260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        TextView f34261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        TextView f34262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        TextView f34263g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        TextView f34264h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        MBridgeLevelLayoutView f34265i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        ImageView f34266j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        ImageView f34267k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        MBCusRoundImageView f34268l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        MBCusRoundImageView f34269m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        MBStarLevelLayoutView f34270n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        MBHeatLevelLayoutView f34271o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        MBFrameLayout f34272p;

        b() {
        }
    }

    public a(List<CampaignEx> list) {
        this.f34253c = list;
    }

    private void a(int i10, ViewGroup viewGroup) {
        List<CampaignEx> list = this.f34253c;
        if (list == null || this.f34252b == null || list.size() == 0) {
            return;
        }
        MBridgeImageView mBridgeImageView = this.f34252b.f34259c;
        if (mBridgeImageView != null) {
            a(mBridgeImageView, this.f34253c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f34252b.f34267k;
        if (imageView != null) {
            a(imageView, this.f34253c.get(i10).getImageUrl(), false);
        }
        RoundImageView roundImageView = this.f34252b.f34260d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f34252b.f34260d, this.f34253c.get(i10).getIconUrl(), true);
        }
        double rating = this.f34253c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBridgeLevelLayoutView mBridgeLevelLayoutView = this.f34252b.f34265i;
        if (mBridgeLevelLayoutView != null) {
            mBridgeLevelLayoutView.setRatingAndUser(rating, this.f34253c.get(i10).getNumberRating());
            this.f34252b.f34265i.setOrientation(0);
        }
        MBRotationView mBRotationView = this.f34252b.f34258b;
        if (mBRotationView != null) {
            mBRotationView.setWidthRatio(1.0f);
            this.f34252b.f34258b.setHeightRatio(1.0f);
            this.f34252b.f34258b.setAutoscroll(false);
        }
        MBridgeImageView mBridgeImageView2 = this.f34252b.f34259c;
        if (mBridgeImageView2 != null) {
            mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private View b(int i10) throws Throwable {
        View viewA;
        String str;
        try {
            List<CampaignEx> list = this.f34253c;
            String cMPTEntryUrl = "";
            if (list == null || list.get(i10) == null) {
                str = "501";
            } else {
                str = this.f34253c.get(i10).getMof_tplid() + "";
                cMPTEntryUrl = this.f34253c.get(i10).getCMPTEntryUrl();
            }
            if (TextUtils.isEmpty(cMPTEntryUrl)) {
                return a();
            }
            int iG = m0.G(com.mbridge.msdk.foundation.controller.c.n().d());
            String strA = z.a(0, str, cMPTEntryUrl);
            if (TextUtils.isEmpty(strA)) {
                return a();
            }
            File file = new File(strA + File.separator + "template_config.json");
            if (file.isFile() && file.exists()) {
                List<String> listA = o0.a(strA, "template_" + str + "_" + iG + "_item");
                if (listA == null) {
                    return a();
                }
                viewA = a(i10, listA);
                return this.f34251a ? viewA : a();
            }
            return a();
        } catch (Exception e10) {
            q0.b("OrderCampAdapter", e10.getMessage());
            viewA = null;
        }
    }

    private int c(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), str, "id");
    }

    public int d(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<CampaignEx> list = this.f34253c;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f34253c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        List<CampaignEx> list = this.f34253c;
        if (list != null) {
            return list.get(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) throws Throwable {
        try {
            if (view == null) {
                view = b(i10);
            } else {
                this.f34252b = (b) view.getTag();
            }
            a(view);
            if (this.f34251a) {
                b(i10, viewGroup);
            } else {
                a(i10, viewGroup);
            }
            a(i10);
        } catch (Exception e10) {
            q0.b("OrderCampAdapter", e10.getMessage());
        }
        List<CampaignEx> list = this.f34253c;
        if (list != null && list.size() > i10) {
            b1.a(view, this.f34253c.get(i10).getLocalRequestId(), this.f34253c.get(i10).getLocalAllowTrackClick());
        }
        return view;
    }

    private void b(int i10, ViewGroup viewGroup) {
        List<CampaignEx> list = this.f34253c;
        if (list == null || this.f34252b == null || list.size() == 0) {
            return;
        }
        MBCusRoundImageView mBCusRoundImageView = this.f34252b.f34268l;
        if (mBCusRoundImageView != null) {
            mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
            a(this.f34252b.f34268l, this.f34253c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f34252b.f34267k;
        if (imageView != null) {
            a(imageView, this.f34253c.get(i10).getImageUrl(), false);
        }
        MBCusRoundImageView mBCusRoundImageView2 = this.f34252b.f34269m;
        if (mBCusRoundImageView2 != null) {
            mBCusRoundImageView2.setBorder(50, 20, -1);
            a(this.f34252b.f34269m, this.f34253c.get(i10).getIconUrl(), true);
        }
        double rating = this.f34253c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBStarLevelLayoutView mBStarLevelLayoutView = this.f34252b.f34270n;
        if (mBStarLevelLayoutView != null) {
            mBStarLevelLayoutView.setRating((int) rating);
            this.f34252b.f34270n.setOrientation(0);
        }
        MBHeatLevelLayoutView mBHeatLevelLayoutView = this.f34252b.f34271o;
        if (mBHeatLevelLayoutView != null) {
            mBHeatLevelLayoutView.setHeatCount(this.f34253c.get(i10).getNumberRating());
        }
    }

    private View a(int i10, List<String> list) {
        int iG = m0.G(com.mbridge.msdk.foundation.controller.c.n().d());
        h.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
        View viewCreateDynamicView = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f34253c.get(i10)).fileDirs(list).dyAdType(DyAdType.REWARD).orientation(iG).adChoiceLink(v0.a(this.f34253c.get(i10))).build());
        if (viewCreateDynamicView != null) {
            this.f34251a = true;
            b bVar = new b();
            this.f34252b = bVar;
            bVar.f34268l = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv"));
            this.f34252b.f34267k = (ImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv_burl"));
            this.f34252b.f34269m = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_icon_iv"));
            this.f34252b.f34270n = (MBStarLevelLayoutView) viewCreateDynamicView.findViewById(b("mbridge_lv_sv_starlevel"));
            this.f34252b.f34272p = (MBFrameLayout) viewCreateDynamicView.findViewById(b("mbridge_lv_ration"));
            viewCreateDynamicView.setTag(this.f34252b);
        }
        return viewCreateDynamicView;
    }

    private int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private View a() {
        View viewInflate = LayoutInflater.from(com.mbridge.msdk.foundation.controller.c.n().d()).inflate(d("mbridge_order_layout_item"), (ViewGroup) null);
        b bVar = new b();
        this.f34252b = bVar;
        bVar.f34259c = (MBridgeImageView) viewInflate.findViewById(c("mbridge_lv_iv"));
        this.f34252b.f34267k = (ImageView) viewInflate.findViewById(c("mbridge_lv_iv_burl"));
        this.f34252b.f34260d = (RoundImageView) viewInflate.findViewById(c("mbridge_lv_icon_iv"));
        this.f34252b.f34265i = (MBridgeLevelLayoutView) viewInflate.findViewById(c("mbridge_lv_sv_starlevel"));
        this.f34252b.f34258b = (MBRotationView) viewInflate.findViewById(c("mbridge_lv_ration"));
        viewInflate.setTag(this.f34252b);
        return viewInflate;
    }

    private void a(View view) {
        this.f34252b.f34257a = (RelativeLayout) view.findViewById(a("mbridge_lv_item_rl"));
        this.f34252b.f34261e = (TextView) view.findViewById(a("mbridge_lv_title_tv"));
        this.f34252b.f34263g = (TextView) view.findViewById(a("mbridge_lv_tv_install"));
        this.f34252b.f34271o = (MBHeatLevelLayoutView) view.findViewById(a("mbridge_lv_sv_heat_level"));
        this.f34252b.f34262f = (TextView) view.findViewById(a("mbridge_lv_desc_tv"));
        this.f34252b.f34266j = (ImageView) view.findViewById(a("mbridge_iv_flag"));
        this.f34252b.f34264h = (TextView) view.findViewById(a("mbridge_order_viewed_tv"));
    }

    private void a(ImageView imageView, String str, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new C0466a(imageView, z10));
        } else if (z10) {
            imageView.setVisibility(8);
        }
    }

    private void a(int i10) {
        b bVar = this.f34252b;
        if (bVar != null) {
            if (bVar.f34261e != null) {
                this.f34252b.f34261e.setText(this.f34253c.get(i10).getAppName());
            }
            if (this.f34252b.f34262f != null) {
                this.f34252b.f34262f.setText(this.f34253c.get(i10).getAppDesc());
            }
            if (this.f34252b.f34263g != null) {
                String adCall = this.f34253c.get(i10).getAdCall();
                if (this.f34252b.f34263g instanceof MBridgeTextView) {
                    ((MBridgeTextView) this.f34252b.f34263g).setObjectAnimator(new com.mbridge.msdk.video.dynview.ui.b().a(this.f34252b.f34263g));
                }
                this.f34252b.f34263g.setText(adCall);
            }
            if (this.f34252b.f34266j != null) {
                try {
                    String language = Locale.getDefault().getLanguage();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (contextD != null) {
                        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                            this.f34252b.f34266j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
                        } else {
                            this.f34252b.f34266j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
                        }
                    }
                } catch (Exception e10) {
                    q0.b("OrderCampAdapter", e10.getMessage());
                }
                v0.a(2, this.f34252b.f34266j, this.f34253c.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), false, null);
            }
            if (this.f34252b.f34264h != null) {
                try {
                    this.f34252b.f34264h.setText(com.mbridge.msdk.foundation.controller.c.n().d().getResources().getString(com.mbridge.msdk.foundation.controller.c.n().d().getResources().getIdentifier("mbridge_reward_viewed_text_str", "string", com.mbridge.msdk.foundation.controller.c.n().i())));
                    this.f34252b.f34264h.setVisibility(0);
                } catch (Exception e11) {
                    q0.b("OrderCampAdapter", e11.getMessage());
                }
            }
        }
    }

    private int a(String str) {
        if (this.f34251a) {
            return b(str);
        }
        return c(str);
    }
}
