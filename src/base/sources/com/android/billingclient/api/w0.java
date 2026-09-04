package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class w0 {
    static final c A;
    static final c B;
    static final c C;
    static final c D;
    static final c E;
    static final c F;
    static final c G;
    static final c H;
    static final c I;
    static final c J;
    static final c K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final c f10430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final c f10431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final c f10432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final c f10433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final c f10434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final c f10435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final c f10436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final c f10437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final c f10438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final c f10439j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final c f10440k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final c f10441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final c f10442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final c f10443n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final c f10444o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final c f10445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final c f10446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final c f10447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final c f10448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final c f10449t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final c f10450u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final c f10451v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final c f10452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final c f10453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final c f10454y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final c f10455z;

    static {
        c.a aVarD = c.d();
        aVarD.d(3);
        aVarD.b("Google Play In-app Billing API version is less than 3");
        aVarD.a();
        c.a aVarD2 = c.d();
        aVarD2.d(3);
        aVarD2.b("Google Play In-app Billing API version is less than 9");
        f10430a = aVarD2.a();
        c.a aVarD3 = c.d();
        aVarD3.d(3);
        aVarD3.b("Billing service unavailable on device.");
        f10431b = aVarD3.a();
        c.a aVarD4 = c.d();
        aVarD4.d(2);
        aVarD4.b("Billing service unavailable on device.");
        f10432c = aVarD4.a();
        c.a aVarD5 = c.d();
        aVarD5.d(5);
        aVarD5.b("Client is already in the process of connecting to billing service.");
        f10433d = aVarD5.a();
        c.a aVarD6 = c.d();
        aVarD6.d(5);
        aVarD6.b("The list of SKUs can't be empty.");
        aVarD6.a();
        c.a aVarD7 = c.d();
        aVarD7.d(5);
        aVarD7.b("SKU type can't be empty.");
        aVarD7.a();
        c.a aVarD8 = c.d();
        aVarD8.d(5);
        aVarD8.b("Product type can't be empty.");
        f10434e = aVarD8.a();
        c.a aVarD9 = c.d();
        aVarD9.d(-2);
        aVarD9.b("Client does not support extra params.");
        f10435f = aVarD9.a();
        c.a aVarD10 = c.d();
        aVarD10.d(5);
        aVarD10.b("Invalid purchase token.");
        f10436g = aVarD10.a();
        c.a aVarD11 = c.d();
        aVarD11.d(6);
        aVarD11.b("An internal error occurred.");
        f10437h = aVarD11.a();
        c.a aVarD12 = c.d();
        aVarD12.d(5);
        aVarD12.b("SKU can't be null.");
        aVarD12.a();
        c.a aVarD13 = c.d();
        aVarD13.d(0);
        f10438i = aVarD13.a();
        c.a aVarD14 = c.d();
        aVarD14.d(-1);
        aVarD14.b("Service connection is disconnected.");
        f10439j = aVarD14.a();
        c.a aVarD15 = c.d();
        aVarD15.d(2);
        aVarD15.b("Timeout communicating with service.");
        f10440k = aVarD15.a();
        c.a aVarD16 = c.d();
        aVarD16.d(-2);
        aVarD16.b("Client does not support subscriptions.");
        f10441l = aVarD16.a();
        c.a aVarD17 = c.d();
        aVarD17.d(-2);
        aVarD17.b("Client does not support subscriptions update.");
        f10442m = aVarD17.a();
        c.a aVarD18 = c.d();
        aVarD18.d(-2);
        aVarD18.b("Client does not support get purchase history.");
        aVarD18.a();
        c.a aVarD19 = c.d();
        aVarD19.d(-2);
        aVarD19.b("Client does not support price change confirmation.");
        f10443n = aVarD19.a();
        c.a aVarD20 = c.d();
        aVarD20.d(-2);
        aVarD20.b("Play Store version installed does not support cross selling products.");
        f10444o = aVarD20.a();
        c.a aVarD21 = c.d();
        aVarD21.d(-2);
        aVarD21.b("Client does not support multi-item purchases.");
        f10445p = aVarD21.a();
        c.a aVarD22 = c.d();
        aVarD22.d(-2);
        aVarD22.b("Client does not support offer_id_token.");
        f10446q = aVarD22.a();
        c.a aVarD23 = c.d();
        aVarD23.d(-2);
        aVarD23.b("Play Store version installed does not support gift code purchase.");
        f10447r = aVarD23.a();
        c.a aVarD24 = c.d();
        aVarD24.d(-2);
        aVarD24.b("Client does not support ProductDetails.");
        f10448s = aVarD24.a();
        c.a aVarD25 = c.d();
        aVarD25.d(-2);
        aVarD25.b("Client does not support launching subscription management action flow.");
        aVarD25.a();
        c.a aVarD26 = c.d();
        aVarD26.d(-2);
        aVarD26.b("Client does not support in-app messages.");
        f10449t = aVarD26.a();
        c.a aVarD27 = c.d();
        aVarD27.d(-2);
        aVarD27.b("Client does not support user choice billing.");
        aVarD27.a();
        c.a aVarD28 = c.d();
        aVarD28.d(-2);
        aVarD28.b("Play Store version installed does not support external offer.");
        f10450u = aVarD28.a();
        c.a aVarD29 = c.d();
        aVarD29.d(-2);
        aVarD29.b("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f10451v = aVarD29.a();
        c.a aVarD30 = c.d();
        aVarD30.d(-2);
        aVarD30.b("Play Store version installed does not support querying AutoPay plan purchase.");
        f10452w = aVarD30.a();
        c.a aVarD31 = c.d();
        aVarD31.d(-2);
        aVarD31.b("Play Store version installed does not support including suspended subscriptions.");
        f10453x = aVarD31.a();
        c.a aVarD32 = c.d();
        aVarD32.d(5);
        aVarD32.b("Unknown feature");
        f10454y = aVarD32.a();
        c.a aVarD33 = c.d();
        aVarD33.d(-2);
        aVarD33.b("Play Store version installed does not support get billing config.");
        f10455z = aVarD33.a();
        c.a aVarD34 = c.d();
        aVarD34.d(-2);
        aVarD34.b("Query product details with serialized docid is not supported.");
        A = aVarD34.a();
        c.a aVarD35 = c.d();
        aVarD35.d(-2);
        aVarD35.b("Play Store version installed does not support launching external offer flow.");
        aVarD35.a();
        c.a aVarD36 = c.d();
        aVarD36.d(4);
        aVarD36.b("Item is unavailable for purchase.");
        B = aVarD36.a();
        c.a aVarD37 = c.d();
        aVarD37.d(-2);
        aVarD37.b("Query product details with developer specified account is not supported.");
        C = aVarD37.a();
        c.a aVarD38 = c.d();
        aVarD38.d(-2);
        aVarD38.b("Play Store version installed does not support alternative billing only.");
        D = aVarD38.a();
        c.a aVarD39 = c.d();
        aVarD39.d(5);
        aVarD39.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        E = aVarD39.a();
        c.a aVarD40 = c.d();
        aVarD40.d(6);
        aVarD40.b("An error occurred while retrieving billing override.");
        F = aVarD40.a();
        c.a aVarD41 = c.d();
        aVarD41.d(-2);
        aVarD41.b("Play Store version installed does not support the provided billing program.");
        G = aVarD41.a();
        c.a aVarD42 = c.d();
        aVarD42.d(-2);
        aVarD42.b("Play Store version installed does not support launching external links.");
        H = aVarD42.a();
        c.a aVarD43 = c.d();
        aVarD43.d(5);
        aVarD43.b("A DeveloperProvidedBillingListener must be provided when initializing the BillingClient in order to use multiple payment options for this billing program.");
        I = aVarD43.a();
        c.a aVarD44 = c.d();
        aVarD44.d(5);
        aVarD44.b("A listener must be provided calling this method.");
        aVarD44.a();
        c.a aVarD45 = c.d();
        aVarD45.d(-2);
        aVarD45.b("Play Store version installed does not support show billing program information dialog.");
        J = aVarD45.a();
        c.a aVarD46 = c.d();
        aVarD46.d(-2);
        aVarD46.b("Play Store version installed does not support get billing choice info.");
        K = aVarD46.a();
    }

    static c a(int i10, String str) {
        c.a aVarD = c.d();
        aVarD.d(i10);
        aVarD.b(str);
        return aVarD.a();
    }
}
