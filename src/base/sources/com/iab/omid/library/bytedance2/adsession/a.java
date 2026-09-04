package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f23789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f23790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f23791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f23792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f23793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f23796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f23799k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f23797i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f23798j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23795g) {
            return;
        }
        this.f23791c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f23792d.get();
    }

    public List<e> d() {
        return this.f23791c.a();
    }

    public boolean e() {
        return this.f23799k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23795g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f23794f && !this.f23795g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f23795g) {
            return;
        }
        this.f23792d.clear();
        removeAllFriendlyObstructions();
        this.f23795g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f23793e = null;
        this.f23799k = null;
    }

    public boolean g() {
        return this.f23795g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f23796h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f23793e;
    }

    public boolean h() {
        return this.f23790b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f23790b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f23794f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f23797i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f23798j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f23795g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23795g) {
            return;
        }
        this.f23791c.b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23795g) {
            return;
        }
        this.f23791c.c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23799k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f23794f) {
            return;
        }
        this.f23794f = true;
        c.c().c(this);
        this.f23793e.a(i.c().b());
        this.f23793e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f23793e.a(this, this.f23789a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f23791c = new f();
        this.f23794f = false;
        this.f23795g = false;
        this.f23790b = adSessionConfiguration;
        this.f23789a = adSessionContext;
        this.f23796h = str;
        b(null);
        this.f23793e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23793e.i();
        c.c().a(this);
        this.f23793e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f23792d.clear();
            }
        }
    }

    private void b(View view) {
        this.f23792d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.bytedance2.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23799k.onPossibleObstructionsDetected(this.f23796h, arrayList);
        }
    }

    void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f23798j = true;
    }
}
