package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: renamed from: com.inmobi.media.od, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3197od implements InterfaceC2975fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2846ao f27131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Je f27132b;

    public C3197od(C2846ao viewableConfig, Je nativeViewabilityViewHolder) {
        kotlin.jvm.internal.s.h(viewableConfig, "viewableConfig");
        kotlin.jvm.internal.s.h(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.f27131a = viewableConfig;
        this.f27132b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    @Override // com.inmobi.media.InterfaceC2975fo
    public final EnumC2949eo a() {
        boolean z10;
        boolean z11;
        C2846ao c2846ao;
        ViewGroup viewGroup = this.f27132b.f25063a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return EnumC2949eo.HIDDEN;
        }
        Je je2 = this.f27132b;
        Ne ne2 = je2.f25067e;
        if (ne2.f25347b.f25370a || ne2.f25346a.f25370a) {
            Nn nn2 = ne2.f25346a;
            ImageView imageView = je2.f25064b;
            if (nn2.f25370a) {
                if ((imageView == null || !nn2.f25371b) ? false : AbstractC3156mo.a(imageView, nn2.f25372c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                c2846ao = this.f27131a;
                if (AbstractC3156mo.a(viewGroup, rect, c2846ao.f26234a, c2846ao.f26235b)) {
                    return EnumC2949eo.VISIBLE;
                }
            } else {
                Nn nn3 = ne2.f25347b;
                MediaView mediaView = this.f27132b.f25065c;
                if (nn3.f25370a) {
                    z11 = (mediaView == null || !nn3.f25371b) ? false : AbstractC3156mo.a(mediaView, nn3.f25372c);
                }
                if (z11) {
                    c2846ao = this.f27131a;
                    if (AbstractC3156mo.a(viewGroup, rect, c2846ao.f26234a, c2846ao.f26235b) && AbstractC3156mo.a(viewGroup, rect, this.f27131a.f26234a, this.f27132b.f25066d)) {
                        return EnumC2949eo.VISIBLE;
                    }
                }
            }
        } else {
            c2846ao = this.f27131a;
            if (AbstractC3156mo.a(viewGroup, rect, c2846ao.f26234a, c2846ao.f26235b)) {
                return EnumC2949eo.VISIBLE;
            }
        }
        return EnumC2949eo.HIDDEN;
    }
}
