package com.mbridge.msdk.video.dynview.wrapper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f34355m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.b f34356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Bitmap> f34357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f34358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34359d = "#FFFFFFFF";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34360e = "#60000000";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34361f = "#FF5F5F5F";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34362g = "#90ECECEC";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f34363h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f34364i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34365j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f34366k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.inter.a f34367l = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class C0473a implements com.mbridge.msdk.video.dynview.util.time.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f34368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f34371d;

        C0473a(TextView textView, String str, CampaignEx campaignEx, Map map) {
            this.f34368a = textView;
            this.f34369b = str;
            this.f34370c = campaignEx;
            this.f34371d = map;
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onFinish() {
            this.f34370c.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f30725c);
            a.this.b(this.f34371d);
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.a
        public void onTick(long j10) {
            a.this.f34366k = (int) (j10 / 1000);
            this.f34368a.setText(com.mbridge.msdk.video.dynview.util.a.a(a.this.f34366k, this.f34368a.getContext()));
            a.this.f34363h++;
            if (TextUtils.isEmpty(this.f34369b) || !this.f34369b.equals("1")) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", "choseFromTwoHeartbeat");
            eVar.a("xtSecond", "countTimeForReport");
            eVar.a("autoPlayCountDownTime", "mLeftOverCountTime");
            com.mbridge.msdk.video.module.report.a.a("2000103", this.f34370c, eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class c implements com.mbridge.msdk.video.dynview.inter.a {
        c() {
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void a() {
            if (!a.this.f34365j || a.this.f34356a == null) {
                return;
            }
            a.this.f34356a.a(a.this.f34366k * 1000, a.this.f34364i);
            a.this.f34365j = false;
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void b() {
            if (a.this.f34356a != null) {
                a.this.f34356a.a();
                a.this.f34365j = true;
            }
        }

        @Override // com.mbridge.msdk.video.dynview.inter.a
        public void c() {
            if (a.this.f34356a != null) {
                a.this.f34356a.a();
                a.this.f34365j = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class d extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f34375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34376c;

        d(Map map, List list) {
            this.f34375b = map;
            this.f34376c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (a.this.f34358c) {
                return;
            }
            a.this.f34358c = true;
            a.this.a(this.f34375b, (List<CampaignEx>) this.f34376c, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class e extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f34378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34379c;

        e(Map map, List list) {
            this.f34378b = map;
            this.f34379c = list;
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (a.this.f34358c) {
                return;
            }
            a.this.f34358c = true;
            a.this.a(this.f34378b, (List<CampaignEx>) this.f34379c, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class f implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f34381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f34382b;

        f(Map map, List list) {
            this.f34381a = map;
            this.f34382b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f34381a, (List<CampaignEx>) this.f34382b, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class g implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f34384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f34385b;

        g(Map map, List list) {
            this.f34384a = map;
            this.f34385b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            a.this.a(this.f34384a, (List<CampaignEx>) this.f34385b, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f34387a;

        h(Map map) {
            this.f34387a = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.a(this.f34387a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class i implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f34390b;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0474a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f34392a;

            /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
            class RunnableC0475a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Bitmap f34394a;

                RunnableC0475a(Bitmap bitmap) {
                    this.f34394a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    i.this.f34390b.setImageBitmap(this.f34394a);
                }
            }

            RunnableC0474a(Bitmap bitmap) {
                this.f34392a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    i.this.f34390b.post(new RunnableC0475a(a0.a(this.f34392a, 10)));
                } catch (Exception e10) {
                    q0.b("DataEnergizeWrapper", e10.getMessage());
                }
            }
        }

        i(int i10, ImageView imageView) {
            this.f34389a = i10;
            this.f34390b = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            try {
                int iA = i0.a(this.f34390b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f34390b.setBackgroundColor(Color.parseColor(a.this.f34361f));
                this.f34390b.setImageResource(iA);
                this.f34390b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e10) {
                q0.a("DataEnergizeWrapper", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                int iA = i0.a(this.f34390b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f34390b.setBackgroundColor(Color.parseColor(a.this.f34361f));
                this.f34390b.setImageResource(iA);
                this.f34390b.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            int i10 = this.f34389a;
            if (i10 != 501 && i10 != 802) {
                this.f34390b.setImageBitmap(bitmap);
            } else {
                com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0474a(bitmap));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class k extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f34402c;

        k(CampaignEx campaignEx, Map map) {
            this.f34401b = campaignEx;
            this.f34402c = map;
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            if (a.this.f34358c) {
                return;
            }
            a.this.f34358c = true;
            this.f34401b.setShowType(com.mbridge.msdk.foundation.same.report.metrics.a.f30726d);
            a.this.b(this.f34402c);
        }
    }

    public void c(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        try {
            if (this.f34357b == null) {
                this.f34357b = new HashMap();
            }
            List<CampaignEx> listB = cVar.b();
            if (view.getContext() == null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f34355m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            for (CampaignEx campaignEx : listB) {
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(f34355m);
                }
            }
            ListView listView = (ListView) view.findViewById(a(f34355m, "mbridge_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a(f34355m, "mbridge_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a(f34355m, "mbridge_order_view_iv_close"));
            com.mbridge.msdk.video.dynview.ordercamp.adapter.a aVar = new com.mbridge.msdk.video.dynview.ordercamp.adapter.a(listB);
            if (cVar.h() == 1) {
                if (listView != null) {
                    a(listView, cVar);
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new f(map, listB));
                }
            } else if (gridView != null) {
                int iM = (int) cVar.m();
                int size = iM / listB.size();
                int i10 = size / 9;
                int i11 = i10 / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = iM - (i10 * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i10) - (i11 / 2));
                gridView.setHorizontalSpacing(i11);
                gridView.setStretchMode(0);
                gridView.setNumColumns(listB.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new g(map, listB));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new h(map));
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements com.mbridge.msdk.foundation.feedback.a {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            if (a.this.f34356a != null) {
                a.this.f34356a.a();
                a.this.f34365j = true;
            }
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            if (!a.this.f34365j || a.this.f34356a == null) {
                return;
            }
            a.this.f34356a.a(a.this.f34366k * 1000, a.this.f34364i);
            a.this.f34365j = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            if (!a.this.f34365j || a.this.f34356a == null) {
                return;
            }
            a.this.f34356a.a(a.this.f34366k * 1000, a.this.f34364i);
            a.this.f34365j = false;
        }
    }

    public void b(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f34355m = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        boolean z10 = f34355m;
        LinearLayout linearLayout = z10 ? (LinearLayout) view.findViewById(a(z10, "mbridge_reward_heat_mllv")) : null;
        ImageView imageView = (ImageView) view.findViewById(a(f34355m, "mbridge_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a(f34355m, "mbridge_reward_title_tv"));
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(a(f34355m, "mbridge_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a(f34355m, "mbridge_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a(f34355m, "mbridge_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a(f34355m, "mbridge_reward_desc_tv"));
        View view2 = (RelativeLayout) view.findViewById(a(f34355m, "mbridge_reward_bottom_layout"));
        List<View> arrayList = new ArrayList<>();
        List<CampaignEx> listB = cVar.b();
        if (listB != null && listB.size() > 0) {
            CampaignEx campaignEx = listB.get(0);
            if (campaignEx != null) {
                if (imageView != null) {
                    if (f34355m) {
                        if (imageView instanceof MBCusRoundImageView) {
                            ((MBCusRoundImageView) imageView).setCustomBorder(30, 30, 30, 30, 10, -1);
                        }
                    } else {
                        ((RoundImageView) imageView).setBorderRadius(10);
                    }
                    a(campaignEx.getIconUrl(), imageView);
                }
                if (textView != null) {
                    textView.setText(campaignEx.getAppName());
                }
                if (textView3 != null) {
                    textView3.setText(campaignEx.getAppDesc());
                }
                if (linearLayout2 != null) {
                    double rating = campaignEx.getRating();
                    if (rating <= 0.0d) {
                        rating = 5.0d;
                    }
                    if (f34355m) {
                        if (linearLayout2 instanceof MBStarLevelLayoutView) {
                            MBStarLevelLayoutView mBStarLevelLayoutView = (MBStarLevelLayoutView) linearLayout2;
                            mBStarLevelLayoutView.setRating((int) rating);
                            mBStarLevelLayoutView.setOrientation(0);
                        }
                        if (linearLayout instanceof MBHeatLevelLayoutView) {
                            ((MBHeatLevelLayoutView) linearLayout).setHeatCount(campaignEx.getNumberRating());
                        }
                    } else {
                        ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, campaignEx.getNumberRating());
                    }
                }
                if (textView2 != null) {
                    textView2.setText(campaignEx.getAdCall());
                }
                int iL = cVar.l();
                if (iL == 102 || iL == 202 || iL == 302) {
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                } else if (iL == 802) {
                    if (imageView != null) {
                        arrayList.add(imageView);
                    }
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                    a(imageView2, campaignEx.getImageUrl(), iL);
                } else if (iL != 902) {
                    if (iL != 904) {
                        if (iL == 5002010) {
                            if (cVar.p() && view2 != null && view2.getVisibility() == 0) {
                                arrayList.add(view2);
                            } else {
                                if (imageView != null) {
                                    arrayList.add(imageView);
                                }
                                if (textView2 != null) {
                                    arrayList.add(textView2);
                                }
                            }
                        }
                    } else if (cVar.p()) {
                        arrayList.add(view);
                    }
                } else if (TextUtils.isEmpty(cVar.n()) || !cVar.n().equals("dsp") || !TextUtils.isEmpty(campaignEx.getClickURL())) {
                    arrayList.add(view);
                }
                eVar.a(view, arrayList);
                return;
            }
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:59:0x0208  */
    /* JADX WARN: Code duplicated, block: B:60:0x0210  */
    /* JADX WARN: Code duplicated, block: B:62:0x0217  */
    /* JADX WARN: Code duplicated, block: B:64:0x0221  */
    /* JADX WARN: Code duplicated, block: B:66:0x023b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0241  */
    /* JADX WARN: Code duplicated, block: B:70:0x024b  */
    /* JADX WARN: Code duplicated, block: B:71:0x028a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0299  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:76:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:79:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x02db  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0306  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public void a(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, com.mbridge.msdk.video.dynview.listener.e eVar) {
        CampaignEx campaignEx;
        CampaignEx campaignEx2;
        RoundImageView roundImageView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        int i10;
        int i11;
        ImageView imageView6;
        ImageView imageView7;
        if (this.f34357b == null) {
            this.f34357b = new HashMap();
        }
        List<CampaignEx> listB = cVar.b();
        if (view == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_ROOTVIEW);
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_CONTEXT);
            return;
        }
        if (listB == null || listB.size() <= 1) {
            campaignEx = null;
            campaignEx2 = null;
        } else {
            campaignEx = listB.get(0);
            campaignEx.setShowIndex(com.mbridge.msdk.foundation.same.report.metrics.a.f30723a);
            campaignEx2 = listB.get(1);
            campaignEx2.setShowIndex(com.mbridge.msdk.foundation.same.report.metrics.a.f30724b);
        }
        if (campaignEx == null && eVar != null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (campaignEx2 == null && eVar != null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f34355m = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(f34355m, "mbridge_top_item_rl"));
        MBridgeImageView mBridgeImageView = (MBridgeImageView) view.findViewById(a(f34355m, "mbridge_top_iv"));
        MBRotationView mBRotationView = (MBRotationView) view.findViewById(a(f34355m, "mbridge_top_ration"));
        TextView textView = (TextView) view.findViewById(a(f34355m, "mbridge_top_title_tv"));
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(a(f34355m, "mbridge_bottom_item_rl"));
        MBRotationView mBRotationView2 = (MBRotationView) view.findViewById(a(f34355m, "mbridge_bottom_ration"));
        MBridgeImageView mBridgeImageView2 = (MBridgeImageView) view.findViewById(a(f34355m, "mbridge_bottom_iv"));
        boolean z10 = f34355m;
        CampaignEx campaignEx3 = campaignEx;
        if (z10) {
            ImageView imageView8 = (MBCusRoundImageView) view.findViewById(a(z10, "mbridge_top_icon_iv"));
            imageView3 = (MBCusRoundImageView) view.findViewById(a(f34355m, "mbridge_bottom_icon_iv"));
            imageView = null;
            imageView2 = imageView8;
            roundImageView = null;
        } else {
            roundImageView = (RoundImageView) view.findViewById(a(z10, "mbridge_top_icon_iv"));
            imageView = (RoundImageView) view.findViewById(a(f34355m, "mbridge_bottom_icon_iv"));
            imageView2 = null;
            imageView3 = null;
        }
        CampaignEx campaignEx4 = campaignEx2;
        TextView textView2 = (TextView) view.findViewById(a(f34355m, "mbridge_bottom_title_tv"));
        ImageView imageView9 = imageView;
        ImageView imageView10 = (ImageView) view.findViewById(a(f34355m, "mbridge_reward_choice_one_like_iv"));
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new d(map, listB));
        }
        if (mBridgeImageView != null) {
            imageView4 = imageView10;
            imageView5 = imageView9;
            mBridgeImageView.setCustomBorder(20, 20, 0, 0, 10, -16777216);
            a(campaignEx3.getImageUrl(), mBridgeImageView, cVar, view);
            if (mBRotationView != null) {
                if (campaignEx3.getCanStart2C1Anim()) {
                    if (!TextUtils.isEmpty(campaignEx3.getIconUrl())) {
                        ImageView imageView11 = new ImageView(cVar.c());
                        imageView11.setLayoutParams(new FrameLayout.LayoutParams(-1, v0.a(cVar.c(), 200.0f)));
                        imageView11.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        mBRotationView.addView(imageView11);
                        a(campaignEx3.getIconUrl(), imageView11);
                        mBRotationView.setWidthRatio(0.45f);
                        mBRotationView.setHeightRatio(0.9f);
                        mBRotationView.setAutoscroll(true);
                    } else {
                        mBRotationView.setWidthRatio(1.0f);
                        mBRotationView.setHeightRatio(1.0f);
                        i10 = 0;
                        mBRotationView.setAutoscroll(false);
                    }
                } else {
                    i10 = 0;
                    mBRotationView.setWidthRatio(1.0f);
                    mBRotationView.setHeightRatio(1.0f);
                    mBRotationView.setAutoscroll(false);
                }
            }
            if (roundImageView != null) {
                roundImageView.setType(i10);
                a(campaignEx3.getIconUrl(), roundImageView);
            }
            if (imageView2 != null) {
                a(campaignEx3.getIconUrl(), imageView2);
            }
            if (textView != null) {
                if (!TextUtils.isEmpty(campaignEx3.getAppName())) {
                    textView.setText(campaignEx3.getAppName());
                } else {
                    textView.setVisibility(8);
                }
            }
            if (relativeLayout2 != null) {
                relativeLayout2.setOnClickListener(new e(map, listB));
            }
            if (mBridgeImageView2 != null) {
                mBridgeImageView2.setCustomBorder(20, 20, 0, 0, 10, -16777216);
                a(campaignEx4.getImageUrl(), mBridgeImageView2, cVar, view);
                if (mBRotationView2 != null) {
                    i11 = 0;
                } else if (campaignEx4.getCanStart2C1Anim()) {
                    if (!TextUtils.isEmpty(campaignEx4.getIconUrl())) {
                        ImageView imageView12 = new ImageView(cVar.c());
                        imageView12.setLayoutParams(new FrameLayout.LayoutParams(-1, v0.a(cVar.c(), 200.0f)));
                        imageView12.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        mBRotationView2.addView(imageView12);
                        a(campaignEx4.getIconUrl(), imageView12);
                        mBRotationView2.setWidthRatio(0.45f);
                        mBRotationView2.setHeightRatio(0.9f);
                        mBRotationView2.setAutoscroll(true);
                        i11 = 0;
                    } else {
                        mBRotationView2.setWidthRatio(1.0f);
                        mBRotationView2.setHeightRatio(1.0f);
                        i11 = 0;
                        mBRotationView2.setAutoscroll(false);
                    }
                } else {
                    i11 = 0;
                    mBRotationView2.setWidthRatio(1.0f);
                    mBRotationView2.setHeightRatio(1.0f);
                    mBRotationView2.setAutoscroll(false);
                }
            } else {
                i11 = 0;
            }
            if (imageView5 != 0) {
                imageView5.setType(i11);
                a(campaignEx4.getIconUrl(), imageView5);
            }
            imageView6 = imageView3;
            if (imageView6 != null) {
                a(campaignEx4.getIconUrl(), imageView6);
            }
            if (textView2 != null) {
                textView2.setText(campaignEx4.getAppName());
            }
            a(campaignEx3.getCMPTEntryUrl(), context, view, cVar.h(), map, campaignEx3);
            imageView7 = imageView4;
            if (imageView7 != null) {
                if (cVar.h() == 1) {
                    imageView7.setImageResource(i0.a(context.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context, 1), "drawable"));
                } else {
                    imageView7.setImageResource(i0.a(context.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context, 2), "drawable"));
                }
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        }
        imageView4 = imageView10;
        imageView5 = imageView9;
        i10 = 0;
        if (roundImageView != null) {
            roundImageView.setType(i10);
            a(campaignEx3.getIconUrl(), roundImageView);
        }
        if (imageView2 != null) {
            a(campaignEx3.getIconUrl(), imageView2);
        }
        if (textView != null) {
            if (!TextUtils.isEmpty(campaignEx3.getAppName())) {
                textView.setText(campaignEx3.getAppName());
            } else {
                textView.setVisibility(8);
            }
        }
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new e(map, listB));
        }
        if (mBridgeImageView2 != null) {
            mBridgeImageView2.setCustomBorder(20, 20, 0, 0, 10, -16777216);
            a(campaignEx4.getImageUrl(), mBridgeImageView2, cVar, view);
            if (mBRotationView2 != null) {
                i11 = 0;
            } else if (campaignEx4.getCanStart2C1Anim()) {
                if (!TextUtils.isEmpty(campaignEx4.getIconUrl())) {
                    ImageView imageView13 = new ImageView(cVar.c());
                    imageView13.setLayoutParams(new FrameLayout.LayoutParams(-1, v0.a(cVar.c(), 200.0f)));
                    imageView13.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    mBRotationView2.addView(imageView13);
                    a(campaignEx4.getIconUrl(), imageView13);
                    mBRotationView2.setWidthRatio(0.45f);
                    mBRotationView2.setHeightRatio(0.9f);
                    mBRotationView2.setAutoscroll(true);
                    i11 = 0;
                } else {
                    mBRotationView2.setWidthRatio(1.0f);
                    mBRotationView2.setHeightRatio(1.0f);
                    i11 = 0;
                    mBRotationView2.setAutoscroll(false);
                }
            } else {
                i11 = 0;
                mBRotationView2.setWidthRatio(1.0f);
                mBRotationView2.setHeightRatio(1.0f);
                mBRotationView2.setAutoscroll(false);
            }
        } else {
            i11 = 0;
        }
        if (imageView5 != 0) {
            imageView5.setType(i11);
            a(campaignEx4.getIconUrl(), imageView5);
        }
        imageView6 = imageView3;
        if (imageView6 != null) {
            a(campaignEx4.getIconUrl(), imageView6);
        }
        if (textView2 != null) {
            textView2.setText(campaignEx4.getAppName());
        }
        a(campaignEx3.getCMPTEntryUrl(), context, view, cVar.h(), map, campaignEx3);
        imageView7 = imageView4;
        if (imageView7 != null) {
            if (cVar.h() == 1) {
                imageView7.setImageResource(i0.a(context.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context, 1), "drawable"));
            } else {
                imageView7.setImageResource(i0.a(context.getApplicationContext(), com.mbridge.msdk.video.dynview.util.a.a(context, 2), "drawable"));
            }
        }
        if (eVar != null) {
            eVar.a(view, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f34396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.dynview.c f34398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f34399d;

        j(ImageView imageView, String str, com.mbridge.msdk.video.dynview.c cVar, View view) {
            this.f34396a = imageView;
            this.f34397b = str;
            this.f34398c = cVar;
            this.f34399d = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ImageView imageView;
            if (bitmap == null || bitmap.isRecycled() || (imageView = this.f34396a) == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
            if (a.this.f34357b != null) {
                a.this.f34357b.put(SameMD5.getMD5(this.f34397b), bitmap);
                a.this.a(this.f34398c, this.f34399d);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
                    ((com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback")).a();
                    b();
                }
            } catch (Exception e10) {
                q0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    private void b(com.mbridge.msdk.video.dynview.c cVar, View view) {
        com.mbridge.msdk.video.dynview.shape.a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
        bVarA.orientation(cVar.h()).a(true);
        if (cVar.h() != 2 || cVar.m() > cVar.k()) {
            bVarA.b(cVar.m()).a(cVar.k());
        } else {
            bVarA.b(cVar.k()).a(cVar.m());
        }
        if (view.getBackground() == null) {
            view.setBackground(bVarA.build());
        }
    }

    private void b() {
        com.mbridge.msdk.video.dynview.util.draw.a.a().b();
        com.mbridge.msdk.video.dynview.util.time.b bVar = this.f34356a;
        if (bVar != null) {
            bVar.a();
            this.f34356a = null;
        }
        com.mbridge.msdk.video.dynview.energize.a.a().f34217a = null;
        if (this.f34367l != null) {
            this.f34367l = null;
        }
        Map<String, Bitmap> map = this.f34357b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f34357b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            this.f34357b.clear();
        }
    }

    public void a(com.mbridge.msdk.video.dynview.c cVar, View view, com.mbridge.msdk.video.dynview.listener.e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_iv_adbanner_bg", "id"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.f34362g));
            }
            ImageView imageView2 = (ImageView) view.findViewById(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_iv_adbanner", "id"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.f34362g));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e10) {
            q0.a(qEagQqzJZsd.unDpsKfX, e10.getMessage());
            eVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(ImageView imageView, String str, int i10) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new i(i10, imageView));
    }

    private void a(String str, ImageView imageView, com.mbridge.msdk.video.dynview.c cVar, View view) {
        com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new j(imageView, str, cVar, view));
        try {
            Bitmap bitmapA = a();
            if (bitmapA == null || bitmapA.isRecycled()) {
                return;
            }
            b(cVar, view);
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    private void a(String str, Context context, View view, int i10, Map map, CampaignEx campaignEx) {
        CampaignEx campaignEx2;
        String strA = c1.a(str, "cltp");
        String strA2 = c1.a(str, "xt");
        long j10 = !TextUtils.isEmpty(strA) ? Long.parseLong(strA) : 0L;
        if (j10 != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f34355m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            TextView textView = (TextView) view.findViewById(a(f34355m, "mbridge_choice_one_countdown_tv"));
            if (textView != null) {
                textView.setTextSize(11.0f);
                textView.setTextColor(Color.parseColor(this.f34359d));
                String str2 = this.f34360e;
                com.mbridge.msdk.video.dynview.util.drawable.a.a(textView, 1, 12, str2, str2);
                textView.setVisibility(0);
                textView.setOnClickListener(new k(campaignEx, map));
                campaignEx2 = campaignEx;
                this.f34364i = new C0473a(textView, strA2, campaignEx2, map);
                com.mbridge.msdk.video.dynview.util.time.b bVarA = new com.mbridge.msdk.video.dynview.util.time.b().b(j10 * 1000).a(1000L).a(this.f34364i);
                this.f34356a = bVarA;
                bVarA.c();
            } else {
                campaignEx2 = campaignEx;
            }
            ImageView imageView = (ImageView) view.findViewById(a(f34355m, "mbridge_iv_link"));
            if (campaignEx2 == null) {
                return;
            }
            if (campaignEx2.getAdchoice() != null) {
                campaignEx2.getAdchoice().g("");
            }
            v0.a(4, imageView, campaignEx2, com.mbridge.msdk.foundation.controller.c.n().d(), false, new b());
        }
    }

    private void a(ListView listView, com.mbridge.msdk.video.dynview.c cVar) {
        if (listView == null || cVar == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = -1;
            float fK = (cVar.k() - v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 720.0f)) / 2.0f;
            int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f);
            int i10 = (int) fK;
            layoutParams.setMargins(iA, i10, iA, i10);
            listView.setLayoutParams(layoutParams);
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map, List<CampaignEx> list, int i10) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof com.mbridge.msdk.video.dynview.listener.d)) {
            com.mbridge.msdk.video.dynview.listener.d dVar = (com.mbridge.msdk.video.dynview.listener.d) map.get("choice_one_callback");
            if (dVar != null) {
                dVar.a(list.get(i10));
                try {
                    CampaignEx campaignEx = list.get(i10);
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    eVar.a("time", Long.valueOf(this.f34363h));
                    eVar.a("choose_cid", campaignEx.getId());
                    eVar.a("position", Integer.valueOf(i10));
                    eVar.a("type", "choseFromTwoSelect");
                    com.mbridge.msdk.video.module.report.a.a("2000103", campaignEx, eVar);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
            b();
            return;
        }
        if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
            com.mbridge.msdk.video.dynview.listener.c cVar = (com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback");
            if (cVar != null) {
                cVar.a(list.get(i10), i10);
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.listener.c)) {
                    ((com.mbridge.msdk.video.dynview.listener.c) map.get("order_view_callback")).close();
                    b();
                }
            } catch (Exception e10) {
                q0.b("DataEnergizeWrapper", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = this.f34357b;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(this.f34357b, cVar, view);
    }

    private int a(boolean z10, String str) {
        try {
            if (z10) {
                if (TextUtils.isEmpty(str)) {
                    return -1;
                }
                return str.hashCode();
            }
            return i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
        } catch (Exception e10) {
            q0.b("DataEnergizeWrapper", e10.getMessage());
            return -1;
        }
    }

    private Bitmap a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor(this.f34362g));
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return bitmapCreateBitmap;
        }
    }
}
