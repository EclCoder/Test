package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MoreOfferContainerView extends ComponentHorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f29296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.config.dynamic.binddata.wrapper.a f29297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<Map<String, Object>> f29298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ViewGroup f29299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnTouchListener f29300f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f29301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.dynamic.binddata.wrapper.a f29302b;

        a(List list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
            this.f29301a = list;
            this.f29302b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MoreOfferContainerView.this.updateMoreOfferData(this.f29301a, this.f29302b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            MoreOfferContainerView.this.a();
            return false;
        }
    }

    public MoreOfferContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29295a = "MoreOfferContainerView";
        this.f29296b = "";
        this.f29300f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getVisibleViews, reason: merged with bridge method [inline-methods] */
    public void a() {
        XMLView xMLView;
        ViewGroup viewGroup = this.f29299e;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < this.f29299e.getChildCount(); i10++) {
            View childAt = this.f29299e.getChildAt(i10);
            Rect rect = new Rect();
            boolean globalVisibleRect = childAt.getGlobalVisibleRect(rect);
            boolean z10 = rect.width() > childAt.getMeasuredWidth() / 5;
            if (globalVisibleRect && z10 && (xMLView = this.xmlView) != null && xMLView.getXmlViewActionListener() != null) {
                HashMap map = new HashMap();
                map.put("view_tag", childAt.getTag());
                HashMap map2 = new HashMap();
                map2.put("index", String.valueOf(childAt.getId()));
                map.put("property", map2);
                this.xmlView.getXmlViewActionListener().a(map);
            }
        }
    }

    public void setData(List<Map<String, Object>> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f29297c = aVar;
        this.f29298d = list;
        postDelayed(new a(list, aVar), 1000L);
    }

    public void setItemXMLPath(String str) {
        this.f29296b = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof List) {
                setData((List) obj, this.f29297c);
            }
        } catch (Throwable th2) {
            q0.b("MoreOfferContainerView", th2.getMessage());
        }
    }

    public void updateMoreOfferData(List<Map<String, Object>> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.f29299e = linearLayout;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Map<String, Object> map = list.get(i10);
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
            aVar2.a((Map<? extends String, ?>) map);
            aVar.a("listData", aVar2);
            View viewA = new com.mbridge.msdk.config.dynamic.a().a(this.f29296b, null, aVar);
            if (viewA != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, 20, 0);
                viewA.setLayoutParams(layoutParams);
                viewA.setId(i10);
                viewA.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f29326a.b(view);
                    }
                });
                linearLayout.addView(viewA);
            }
        }
        if (linearLayout.getChildCount() > 0) {
            if (getChildCount() > 0) {
                removeAllViews();
            }
            addView(linearLayout);
            setOnTouchListener(this.f29300f);
            linearLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29327a.a();
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        String string = view.getTag().toString();
        int id2 = view.getId();
        a(String.valueOf(id2), string, this.f29298d.get(id2));
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        com.mbridge.msdk.config.component.common.file.b bVarE;
        if (map == null) {
            return;
        }
        try {
            if (String.valueOf(map.get("clickable")).equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("parentPath");
            String strC = "";
            if (obj instanceof String) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && (bVarE = com.mbridge.msdk.config.component.common.file.a.e(strValueOf)) != null && !TextUtils.isEmpty(bVarE.c())) {
                    strC = bVarE.c();
                }
            }
            Object obj2 = map.get("itemXml");
            if (obj2 instanceof String) {
                setItemXMLPath(strC.concat(obj2.toString()).concat(".xml"));
            }
            Object obj3 = map.get(IAoPeRfJn.RWrmquoMLzegt);
            if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                this.f29297c = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3;
            }
            Object obj4 = map.get(DataSchemeDataSource.SCHEME_DATA);
            if (obj4 instanceof List) {
                setData((List) obj4, this.f29297c);
            }
        } catch (Throwable th2) {
            q0.b("MoreOfferContainerView", th2.getMessage());
        }
    }

    void a(String str, String str2, Map<String, Object> map) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(this);
        }
        HashMap map2 = new HashMap();
        map2.put("viewTag", str2);
        HashMap map3 = new HashMap();
        map3.put("index", str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        map3.put("selectedContents", arrayList);
        map2.put("property", map3);
        f.a(this.xmlView, str2, map2);
    }
}
