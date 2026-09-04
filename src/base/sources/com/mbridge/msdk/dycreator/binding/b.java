package com.mbridge.msdk.dycreator.binding;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBApkInfoView;
import com.mbridge.msdk.dycreator.baseview.MBFeedBack;
import com.mbridge.msdk.dycreator.baseview.MBLogoTextView;
import com.mbridge.msdk.dycreator.baseview.MBSplashClickView;
import com.mbridge.msdk.dycreator.baseview.MBSplashImageBgView;
import com.mbridge.msdk.dycreator.baseview.MBSplashPortView;
import com.mbridge.msdk.dycreator.baseview.MBSplashShakeView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.viewobserver.i;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile b f29876g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewobserver.d f29877a = (com.mbridge.msdk.dycreator.viewobserver.d) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(com.mbridge.msdk.dycreator.subjectfactory.a.b.VIEW_OBSERVER);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewobserver.c f29878b = (com.mbridge.msdk.dycreator.viewobserver.c) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(com.mbridge.msdk.dycreator.subjectfactory.a.b.CLICK_OBSERVER);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewobserver.f f29879c = (com.mbridge.msdk.dycreator.viewobserver.f) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(com.mbridge.msdk.dycreator.subjectfactory.a.b.EFFECT_OBSERVER);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f29880d = (h) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(com.mbridge.msdk.dycreator.subjectfactory.a.b.REPORT_OBSERVER);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BaseViewModel f29881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.shake.b f29882f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.dycreator.viewobserver.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29883a;

        a(View view) {
            this.f29883a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.g
        public void a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f29883a;
                if (callback instanceof InterBase) {
                    b.this.b((InterBase) callback, obj);
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0384b implements com.mbridge.msdk.dycreator.viewobserver.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29885a;

        C0384b(View view) {
            this.f29885a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.e
        public void a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f29885a;
                if (callback instanceof InterBase) {
                    b.this.a((InterBase) callback, obj);
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29887a;

        c(View view) {
            this.f29887a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.i
        public void a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f29887a;
                if (callback instanceof InterBase) {
                    b.this.c((InterBase) callback, obj);
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements com.mbridge.msdk.dycreator.viewobserver.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f29889a;

        d(View view) {
            this.f29889a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.b
        public void a(Object obj) {
            if (obj == null) {
                return;
            }
            try {
                if (com.mbridge.msdk.dycreator.utils.d.a(this.f29889a, (com.mbridge.msdk.dycreator.viewdata.base.a) obj)) {
                    b.this.a(this.f29889a, obj);
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements DyCountDownListenerWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f29891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f29894d;

        e(boolean z10, String str, String str2, View view) {
            this.f29891a = z10;
            this.f29892b = str;
            this.f29893c = str2;
            this.f29894d = view;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper
        public void getCountDownValue(int i10) {
            if (i10 != 0) {
                ((TextView) this.f29894d).setText(com.mbridge.msdk.dycreator.utils.d.a(this.f29891a, i10, this.f29892b, this.f29893c));
            } else {
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.dycreator.viewdata.base.a f29896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f29897b;

        f(com.mbridge.msdk.dycreator.viewdata.base.a aVar, View view) {
            this.f29896a = aVar;
            this.f29897b = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            View view = this.f29897b;
            if (view != null) {
                ((ImageView) view).setBackgroundColor(-7829368);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (!bitmap.isRecycled()) {
                        boolean z10 = bitmap.getWidth() > bitmap.getHeight();
                        if ((this.f29896a.getEffectData().getOrientation() == 1 ? this.f29897b.getResources().getConfiguration().orientation : this.f29896a.getEffectData().getOrientation()) == 1) {
                            if (z10) {
                                View view = this.f29897b;
                                if (view instanceof MBSplashPortView) {
                                    if (view.getParent() != null) {
                                        ((ViewGroup) this.f29897b.getParent()).setVisibility(8);
                                        return;
                                    }
                                    return;
                                } else if (view instanceof MBSplashImageBgView) {
                                    view.setVisibility(0);
                                    Bitmap bitmapA = p0.a(bitmap);
                                    ((MBSplashImageBgView) this.f29897b).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    ((MBSplashImageBgView) this.f29897b).setImageBitmap(bitmapA);
                                    return;
                                }
                            } else {
                                View view2 = this.f29897b;
                                if (view2 instanceof MBSplashPortView) {
                                    view2.setVisibility(0);
                                    ((MBSplashPortView) this.f29897b).setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    ((MBSplashPortView) this.f29897b).setImageBitmap(bitmap);
                                    return;
                                } else if (view2 instanceof MBSplashImageBgView) {
                                    view2.setVisibility(8);
                                    return;
                                } else if (view2 instanceof InterBase) {
                                    String effectDes = ((InterBase) view2).getEffectDes();
                                    ViewGroup viewGroup = (ViewGroup) this.f29897b.getParent();
                                    if (viewGroup != null) {
                                        com.mbridge.msdk.dycreator.utils.d.a(effectDes, viewGroup, true);
                                    }
                                }
                            }
                        } else if (z10) {
                            View view3 = this.f29897b;
                            if (view3 instanceof MBSplashPortView) {
                                view3.setVisibility(0);
                                ((MBSplashPortView) this.f29897b).setScaleType(ImageView.ScaleType.FIT_XY);
                                ((ImageView) this.f29897b).setImageBitmap(bitmap);
                                return;
                            } else if (view3 instanceof MBSplashImageBgView) {
                                view3.setVisibility(8);
                                ((MBSplashImageBgView) this.f29897b).setImageBitmap(p0.a(bitmap));
                                return;
                            } else if (view3 instanceof InterBase) {
                                String effectDes2 = ((InterBase) view3).getEffectDes();
                                ViewGroup viewGroup2 = (ViewGroup) this.f29897b.getParent();
                                if (viewGroup2 != null) {
                                    com.mbridge.msdk.dycreator.utils.d.a(effectDes2, viewGroup2, true);
                                }
                            }
                        } else {
                            View view4 = this.f29897b;
                            if (view4 instanceof MBSplashPortView) {
                                view4.setVisibility(0);
                                ((MBSplashPortView) this.f29897b).setImageBitmap(bitmap);
                                return;
                            } else {
                                if (view4 instanceof MBSplashImageBgView) {
                                    view4.setVisibility(0);
                                    Bitmap bitmapA2 = p0.a(bitmap);
                                    ((MBSplashImageBgView) this.f29897b).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    ((MBSplashImageBgView) this.f29897b).setImageBitmap(bitmapA2);
                                    return;
                                }
                                if (view4 instanceof InterBase) {
                                    String effectDes3 = ((InterBase) view4).getEffectDes();
                                    ViewGroup viewGroup3 = (ViewGroup) this.f29897b.getParent();
                                    if (viewGroup3 != null) {
                                        com.mbridge.msdk.dycreator.utils.d.a(effectDes3, viewGroup3, true);
                                    }
                                }
                            }
                        }
                        ((ImageView) this.f29897b).setImageBitmap(bitmap);
                        return;
                    }
                } catch (Exception e10) {
                    q0.b("MBDataBinding", e10.getMessage());
                    return;
                }
            }
            ((ImageView) this.f29897b).setBackgroundColor(-7829368);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends com.mbridge.msdk.shake.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f29899g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ MBSplashData f29900h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, int i11, View view, MBSplashData mBSplashData) {
            super(i10, i11);
            this.f29899g = view;
            this.f29900h = mBSplashData;
        }

        @Override // com.mbridge.msdk.shake.b
        public void a() {
            View view = this.f29899g;
            if (view != null) {
                try {
                    if (view.getGlobalVisibleRect(new Rect())) {
                        SplashResData splashResData = new SplashResData();
                        this.f29900h.setClickType(4);
                        splashResData.setBaseViewData(this.f29900h);
                        splashResData.seteAction(EAction.DOWNLOAD);
                        EventBus.getDefault().post(splashResData);
                        com.mbridge.msdk.shake.a.a().b(b.this.f29882f);
                    }
                } catch (Exception e10) {
                    q0.b("MBDataBinding", e10.getMessage());
                }
            }
        }
    }

    private b() {
    }

    public void d(View view) {
        a(new a(view), view.getId());
    }

    public void b(View view) {
        a(new c(view), view.getId());
    }

    public void c(View view) {
        a(new C0384b(view), view.getId());
    }

    public static b a() {
        if (f29876g == null) {
            synchronized (b.class) {
                try {
                    if (f29876g == null) {
                        f29876g = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f29876g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterBase interBase, Object obj) {
        if (interBase == null || obj == null) {
            return;
        }
        String reportDes = interBase.getReportDes();
        if (TextUtils.isEmpty(reportDes)) {
            return;
        }
        try {
            if (!(obj instanceof com.mbridge.msdk.dycreator.viewdata.base.a) || ((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData() == null) {
                return;
            }
            interBase.setDynamicReport(reportDes, ((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void c(InterBase interBase, Object obj) {
        if (interBase == 0 || obj == null) {
            return;
        }
        String bindDataDes = interBase.getBindDataDes();
        if (TextUtils.isEmpty(bindDataDes)) {
            return;
        }
        try {
            Object objA = com.mbridge.msdk.dycreator.utils.d.a(obj, bindDataDes);
            if (objA == null) {
                return;
            }
            if (interBase instanceof ViewGroup) {
                b((ViewGroup) interBase, objA, (com.mbridge.msdk.dycreator.viewdata.base.a) obj);
            } else if (interBase instanceof View) {
                a((View) interBase, objA, (com.mbridge.msdk.dycreator.viewdata.base.a) obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(i iVar, int i10) {
        com.mbridge.msdk.dycreator.viewobserver.d dVar = this.f29877a;
        if (dVar != null) {
            dVar.a(iVar, i10);
        }
    }

    private void b(ViewGroup viewGroup, Object obj, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        if (viewGroup != null) {
            if (viewGroup instanceof MBSplashClickView) {
                if (aVar == null || aVar.getEffectData() == null || !aVar.getEffectData().isClickButtonVisible() || aVar.getEffectData().isShakeVisible()) {
                    viewGroup.setVisibility(8);
                } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
                    viewGroup.setVisibility(0);
                    ((MBSplashClickView) viewGroup).initView(obj.toString());
                }
            }
            if (viewGroup instanceof MBSplashShakeView) {
                if (aVar != null && aVar.getEffectData() != null && aVar.getEffectData().isShakeVisible()) {
                    if (obj == null || TextUtils.isEmpty(obj.toString())) {
                        return;
                    }
                    viewGroup.setVisibility(0);
                    ((MBSplashShakeView) viewGroup).initView(obj.toString());
                    return;
                }
                viewGroup.setVisibility(8);
            }
        }
    }

    private void a(com.mbridge.msdk.dycreator.viewobserver.b bVar, int i10) {
        com.mbridge.msdk.dycreator.viewobserver.c cVar = this.f29878b;
        if (cVar != null) {
            cVar.a(bVar, i10);
        }
    }

    private void a(com.mbridge.msdk.dycreator.viewobserver.e eVar, int i10) {
        com.mbridge.msdk.dycreator.viewobserver.f fVar = this.f29879c;
        if (fVar != null) {
            fVar.a(eVar, i10);
        }
    }

    private void a(com.mbridge.msdk.dycreator.viewobserver.g gVar, int i10) {
        h hVar = this.f29880d;
        if (hVar != null) {
            hVar.a(gVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(View view) {
        if (view != 0) {
            try {
                if (view instanceof InterBase) {
                    String actionDes = ((InterBase) view).getActionDes();
                    if (TextUtils.isEmpty(actionDes)) {
                        return;
                    }
                    if (actionDes.startsWith(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                        a(new d(view), view.getId());
                        return;
                    }
                    if (!actionDes.equals("move") && !actionDes.equals("long_click")) {
                        actionDes.equals("wobble");
                    }
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    public synchronized void b() {
        try {
            com.mbridge.msdk.dycreator.viewobserver.c cVar = this.f29878b;
            if (cVar != null) {
                cVar.a();
            }
            com.mbridge.msdk.dycreator.viewobserver.d dVar = this.f29877a;
            if (dVar != null) {
                dVar.a();
            }
            com.mbridge.msdk.dycreator.viewobserver.f fVar = this.f29879c;
            if (fVar != null) {
                fVar.a();
            }
            if (this.f29881e != null) {
                this.f29881e = null;
            }
            if (this.f29882f != null) {
                this.f29882f = null;
            }
            if (f29876g != null) {
                f29876g = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(InterBase interBase, Object obj) {
        if (interBase == 0 || obj == null) {
            return;
        }
        String effectDes = interBase.getEffectDes();
        if (TextUtils.isEmpty(effectDes)) {
            return;
        }
        try {
            if (interBase instanceof ViewGroup) {
                a((ViewGroup) interBase, (Object) effectDes, (com.mbridge.msdk.dycreator.viewdata.base.a) obj);
            } else if (interBase instanceof View) {
                a((View) interBase, effectDes, obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(ViewGroup viewGroup, Object obj, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        if (obj.equals("wobble") && (viewGroup instanceof MBSplashShakeView)) {
            if (aVar.getEffectData().isShakeVisible()) {
                if (this.f29882f != null) {
                    com.mbridge.msdk.shake.a.a().b(this.f29882f);
                }
                com.mbridge.msdk.shake.a.a().a(a((View) viewGroup, (MBSplashData) aVar));
            } else if (this.f29882f != null) {
                com.mbridge.msdk.shake.a.a().b(this.f29882f);
            }
        }
        if (obj.equals("visible") && (viewGroup instanceof MBApkInfoView)) {
            if (aVar.getEffectData().isApkInfoVisible()) {
                if ((aVar instanceof MBSplashData) && !TextUtils.isEmpty(((MBSplashData) aVar).getAppInfo())) {
                    viewGroup.setVisibility(0);
                } else {
                    viewGroup.setVisibility(4);
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        obj.equals("anim");
    }

    private void a(View view, Object obj, Object obj2) {
        View view2;
        int countDownTime;
        boolean z10;
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        com.mbridge.msdk.dycreator.viewdata.base.a aVar = (com.mbridge.msdk.dycreator.viewdata.base.a) obj2;
        if (!obj.equals("countdown") || view == null || !(view instanceof TextView) || aVar == null) {
            view2 = view;
        } else {
            TextView textView = (TextView) view;
            String str = (String) textView.getText();
            String strP = m0.p(view.getContext());
            DyOption effectData = aVar.getEffectData();
            if (effectData != null) {
                boolean zIsCanSkip = effectData.isCanSkip();
                countDownTime = effectData.getCountDownTime();
                z10 = zIsCanSkip;
            } else {
                countDownTime = 5;
                z10 = false;
            }
            textView.setText(com.mbridge.msdk.dycreator.utils.d.a(z10, countDownTime, str, strP));
            view2 = view;
            aVar.getEffectData().setDyCountDownListenerWrapper(new e(z10, str, strP, view2));
        }
        obj.equals("anim");
        if (obj.equals("visible")) {
            if (view2 instanceof MBFeedBack) {
                if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(8);
                }
            }
            if (!(view2 instanceof MBLogoTextView) || aVar == null || aVar.getEffectData() == null || aVar.getEffectData().isLogoVisible()) {
                return;
            }
            ((MBLogoTextView) view2).setCompoundDrawables(null, null, null, null);
        }
    }

    private void a(View view, Object obj, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        if (view == null || obj == null) {
            return;
        }
        try {
            if (view instanceof TextView) {
                try {
                    ((TextView) view).setText(String.valueOf(obj).replace("\\n", "\n"));
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            if (view instanceof ImageView) {
                if (obj instanceof Integer) {
                    ((ImageView) view).setImageResource(((Integer) obj).intValue());
                }
                if (obj instanceof String) {
                    com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj.toString(), new f(aVar, view));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Object obj) {
        if (view == null || obj == null || !(obj instanceof com.mbridge.msdk.dycreator.viewdata.base.a)) {
            return;
        }
        view.setOnClickListener(new com.mbridge.msdk.dycreator.binding.a((com.mbridge.msdk.dycreator.viewdata.base.a) obj));
    }

    public void a(BaseViewModel baseViewModel) {
        this.f29881e = baseViewModel;
        if (baseViewModel != null) {
            baseViewModel.setClickSubject(this.f29878b);
            this.f29881e.setConcreteSubject(this.f29877a);
            this.f29881e.setEffectSubject(this.f29879c);
            this.f29881e.setReportSubject(this.f29880d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    private com.mbridge.msdk.shake.b a(View view, MBSplashData mBSplashData) {
        b bVar;
        if (mBSplashData != null) {
            try {
                DyOption dyOption = mBSplashData.getDyOption();
                if (dyOption != null && dyOption.isShakeVisible() && this.f29882f == null) {
                    bVar = this;
                    try {
                        bVar.f29882f = bVar.new g(dyOption.getShakeStrenght(), dyOption.getShakeTime() * 1000, view, mBSplashData);
                    } catch (Exception e10) {
                        e = e10;
                        q0.b("MBDataBinding", e.getMessage());
                    }
                } else {
                    bVar = this;
                }
            } catch (Exception e11) {
                e = e11;
                bVar = this;
            }
        } else {
            bVar = this;
        }
        return bVar.f29882f;
    }
}
