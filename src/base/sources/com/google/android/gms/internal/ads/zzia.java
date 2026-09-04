package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzia extends zzhh implements zzii {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzih zze;
    private final zzih zzf;
    private zzht zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzia(String str, int i10, int i11, boolean z10, boolean z11, zzih zzihVar, zzgtk zzgtkVar, boolean z12, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zza = z10;
        this.zze = zzihVar;
        this.zzf = new zzih();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    private final HttpURLConnection zzk(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        StringBuilder sb2;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 != 0) {
            sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        } else if (j11 == -1) {
            string = null;
        } else {
            j10 = 0;
            sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string);
        }
        String str = this.zzd;
        if (str != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z10 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(false);
        int i11 = zzht.zzh;
        httpURLConnection.setRequestMethod(HttpMethods.GET);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzht zzhtVar) throws zzie {
        if (str == null) {
            throw new zzie("Null location redirect", zzhtVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzie("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhtVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(String.valueOf(protocol2).length() + 40 + protocol.length() + 1);
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(")");
            throw new zzie(sb2.toString(), zzhtVar, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new zzie(e10, zzhtVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzeg.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzie {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzl;
            if (j10 != -1) {
                long j11 = j10 - this.zzm;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.zzi;
            String str = zzfl.zza;
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.zzm += (long) i12;
            zzh(i12);
            return i12;
        } catch (IOException e10) {
            zzht zzhtVar = this.zzg;
            String str2 = zzfl.zza;
            throw zzie.zza(e10, zzhtVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(zzht zzhtVar) throws zzie {
        zzia zziaVar;
        long j10;
        int i10;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j11;
        zzia zziaVar2 = this;
        zziaVar2.zzg = zzhtVar;
        long j12 = 0;
        zziaVar2.zzm = 0L;
        zziaVar2.zzl = 0L;
        zzf(zzhtVar);
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            URL url = new URL(zzhtVar.zza.toString());
            long j13 = zzhtVar.zze;
            long j14 = zzhtVar.zzf;
            boolean zZza = zzhtVar.zza(1);
            int i11 = 0;
            try {
                if (zziaVar2.zza) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i11 + 1;
                        if (i11 > 20) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 20);
                            sb2.append("Too many redirects: ");
                            sb2.append(i13);
                            throw new zzie(new NoRouteToHostException(sb2.toString()), zzhtVar, 2001, 1);
                        }
                        j10 = j12;
                        i10 = i12;
                        zziaVar2 = this;
                        HttpURLConnection httpURLConnectionZzk2 = zziaVar2.zzk(url, 1, null, j13, j14, zZza, false, zzhtVar.zzd);
                        URL url2 = url;
                        long j15 = j14;
                        zziaVar = zziaVar2;
                        try {
                            int responseCode = httpURLConnectionZzk2.getResponseCode();
                            String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnectionZzk = httpURLConnectionZzk2;
                                break;
                            }
                            httpURLConnectionZzk2.disconnect();
                            URL urlZzl = zziaVar.zzl(url2, headerField, zzhtVar);
                            j14 = j15;
                            url = urlZzl;
                            i12 = i10;
                            i11 = i13;
                            j12 = j10;
                        } catch (IOException e10) {
                            e = e10;
                        }
                        zziaVar.zzm();
                        throw zzie.zza(e, zzhtVar, 1);
                    }
                }
                httpURLConnectionZzk = zziaVar2.zzk(url, 1, null, j13, j14, zZza, true, zzhtVar.zzd);
                zziaVar = this;
                j10 = 0;
                i10 = 0;
                zziaVar.zzh = httpURLConnectionZzk;
                zziaVar.zzk = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i14 = zziaVar.zzk;
                if (i14 < 200 || i14 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (zziaVar.zzk == 416) {
                        if (zzhtVar.zze == zzij.zza(httpURLConnectionZzk.getHeaderField("Content-Range"))) {
                            zziaVar.zzj = true;
                            zzg(zzhtVar);
                            long j16 = zzhtVar.zzf;
                            return j16 != -1 ? j16 : j10;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZza = errorStream != null ? zzgzm.zza(errorStream) : zzfl.zzb;
                    } catch (IOException unused) {
                        bArrZza = zzfl.zzb;
                    }
                    zziaVar.zzm();
                    throw new zzig(zziaVar.zzk, responseMessage, zziaVar.zzk == 416 ? new zzhq(2008) : null, headerFields, zzhtVar, bArrZza);
                }
                httpURLConnectionZzk.getContentType();
                if (zziaVar.zzk == 200) {
                    j11 = zzhtVar.zze;
                    if (j11 == j10) {
                        j11 = j10;
                    }
                } else {
                    j11 = j10;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    zziaVar.zzl = zzhtVar.zzf;
                } else {
                    long j17 = zzhtVar.zzf;
                    if (j17 != -1) {
                        zziaVar.zzl = j17;
                    } else {
                        long jZzb = zzij.zzb(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField("Content-Range"));
                        zziaVar.zzl = jZzb != -1 ? jZzb - j11 : -1L;
                    }
                }
                try {
                    zziaVar.zzi = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        zziaVar.zzi = new GZIPInputStream(zziaVar.zzi);
                    }
                    zziaVar.zzj = true;
                    zzg(zzhtVar);
                    if (j11 != j10) {
                        try {
                            byte[] bArr = new byte[4096];
                            while (j11 > j10) {
                                int iMin = (int) Math.min(j11, 4096L);
                                InputStream inputStream = zziaVar.zzi;
                                String str = zzfl.zza;
                                int i15 = inputStream.read(bArr, i10, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzie(new InterruptedIOException(), zzhtVar, 2000, 1);
                                }
                                if (i15 == -1) {
                                    throw new zzie(zzhtVar, 2008, 1);
                                }
                                j11 -= (long) i15;
                                zziaVar.zzh(i15);
                            }
                        } catch (IOException e11) {
                            zziaVar.zzm();
                            if (e11 instanceof zzie) {
                                throw ((zzie) e11);
                            }
                            throw new zzie(e11, zzhtVar, 2000, 1);
                        }
                    }
                    return zziaVar.zzl;
                } catch (IOException e12) {
                    zziaVar.zzm();
                    throw new zzie(e12, zzhtVar, 2000, 1);
                }
            } catch (IOException e13) {
                e = e13;
                zziaVar = this;
            }
        } catch (IOException e14) {
            e = e14;
            zziaVar = zziaVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzht zzhtVar = this.zzg;
        if (zzhtVar != null) {
            return zzhtVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    zzht zzhtVar = this.zzg;
                    String str = zzfl.zza;
                    throw new zzie(e10, zzhtVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th2) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzii
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgwp.zza() : new zzhz(httpURLConnection.getHeaderFields());
    }
}
