package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Od implements InterfaceC2975fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2846ao f25415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Je f25416b;

    public Od(C2846ao viewableConfig, Je nativeViewabilityViewHolder) {
        kotlin.jvm.internal.s.h(viewableConfig, "viewableConfig");
        kotlin.jvm.internal.s.h(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.f25415a = viewableConfig;
        this.f25416b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    @Override // com.inmobi.media.InterfaceC2975fo
    public final EnumC2949eo a() {
        boolean zA;
        boolean z10;
        ViewGroup viewGroup = this.f25416b.f25063a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return EnumC2949eo.HIDDEN;
        }
        Je je2 = this.f25416b;
        Ne ne2 = je2.f25067e;
        Nn nn2 = ne2.f25347b;
        if (nn2.f25370a) {
            MediaView mediaView = je2.f25065c;
            if (mediaView == null || !nn2.f25371b) {
                zA = false;
            } else {
                zA = AbstractC3156mo.a(mediaView, nn2.f25372c);
            }
        } else {
            Nn nn3 = ne2.f25346a;
            if (nn3.f25370a) {
                ImageView imageView = je2.f25064b;
                if (imageView == null || !nn3.f25371b) {
                    zA = false;
                } else {
                    zA = AbstractC3156mo.a(imageView, nn3.f25372c);
                }
            } else {
                zA = true;
            }
        }
        if (zA) {
            C2846ao c2846ao = this.f25415a;
            z10 = AbstractC3156mo.a(viewGroup, rect, c2846ao.f26234a, c2846ao.f26235b) && AbstractC3156mo.a(viewGroup, rect, this.f25415a.f26234a, this.f25416b.f25066d);
        }
        return z10 ? EnumC2949eo.VISIBLE : EnumC2949eo.HIDDEN;
    }
}
