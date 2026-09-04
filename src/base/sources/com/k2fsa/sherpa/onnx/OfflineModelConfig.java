package com.k2fsa.sherpa.onnx;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u007f\b\u0086\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020%\u0012\b\b\u0002\u0010+\u001a\u00020%\u0012\b\b\u0002\u0010,\u001a\u00020%\u0012\b\b\u0002\u0010-\u001a\u00020%\u0012\b\b\u0002\u0010.\u001a\u00020%¢\u0006\u0002\u0010/J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u001bHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u001fHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020!HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020#HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020'HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020)HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\rHÆ\u0003J\n\u0010 \u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0013HÆ\u0003J\u0084\u0002\u0010£\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020%2\b\b\u0002\u0010+\u001a\u00020%2\b\b\u0002\u0010,\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020%HÆ\u0001J\u0015\u0010¤\u0001\u001a\u00020)2\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¦\u0001\u001a\u00020'HÖ\u0001J\n\u0010§\u0001\u001a\u00020%HÖ\u0001R\u001a\u0010.\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010+\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u00101\"\u0004\bU\u00103R\u001a\u0010-\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00101\"\u0004\bW\u00103R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010*\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00101\"\u0004\bm\u00103R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u00101\"\u0004\bw\u00103R\u001a\u0010,\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u00101\"\u0004\by\u00103R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001c\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001e\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006¨\u0001"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineModelConfig;", "", "transducer", "Lcom/k2fsa/sherpa/onnx/OfflineTransducerModelConfig;", "paraformer", "Lcom/k2fsa/sherpa/onnx/OfflineParaformerModelConfig;", "whisper", "Lcom/k2fsa/sherpa/onnx/OfflineWhisperModelConfig;", "fireRedAsr", "Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrModelConfig;", "moonshine", "Lcom/k2fsa/sherpa/onnx/OfflineMoonshineModelConfig;", "nemo", "Lcom/k2fsa/sherpa/onnx/OfflineNemoEncDecCtcModelConfig;", "senseVoice", "Lcom/k2fsa/sherpa/onnx/OfflineSenseVoiceModelConfig;", "dolphin", "Lcom/k2fsa/sherpa/onnx/OfflineDolphinModelConfig;", "zipformerCtc", "Lcom/k2fsa/sherpa/onnx/OfflineZipformerCtcModelConfig;", "wenetCtc", "Lcom/k2fsa/sherpa/onnx/OfflineWenetCtcModelConfig;", "omnilingual", "Lcom/k2fsa/sherpa/onnx/OfflineOmnilingualAsrCtcModelConfig;", "medasr", "Lcom/k2fsa/sherpa/onnx/OfflineMedAsrCtcModelConfig;", "funasrNano", "Lcom/k2fsa/sherpa/onnx/OfflineFunAsrNanoModelConfig;", "qwen3Asr", "Lcom/k2fsa/sherpa/onnx/OfflineQwen3AsrModelConfig;", "fireRedAsrCtc", "Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrCtcModelConfig;", "canary", "Lcom/k2fsa/sherpa/onnx/OfflineCanaryModelConfig;", "cohereTranscribe", "Lcom/k2fsa/sherpa/onnx/OfflineCohereTranscribeModelConfig;", "teleSpeech", "", "numThreads", "", "debug", "", "provider", "modelType", "tokens", "modelingUnit", "bpeVocab", "(Lcom/k2fsa/sherpa/onnx/OfflineTransducerModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineParaformerModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineWhisperModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineMoonshineModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineNemoEncDecCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineSenseVoiceModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineDolphinModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineZipformerCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineWenetCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineOmnilingualAsrCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineMedAsrCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineFunAsrNanoModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineQwen3AsrModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineCanaryModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineCohereTranscribeModelConfig;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBpeVocab", "()Ljava/lang/String;", "setBpeVocab", "(Ljava/lang/String;)V", "getCanary", "()Lcom/k2fsa/sherpa/onnx/OfflineCanaryModelConfig;", "setCanary", "(Lcom/k2fsa/sherpa/onnx/OfflineCanaryModelConfig;)V", "getCohereTranscribe", "()Lcom/k2fsa/sherpa/onnx/OfflineCohereTranscribeModelConfig;", "setCohereTranscribe", "(Lcom/k2fsa/sherpa/onnx/OfflineCohereTranscribeModelConfig;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getDolphin", "()Lcom/k2fsa/sherpa/onnx/OfflineDolphinModelConfig;", "setDolphin", "(Lcom/k2fsa/sherpa/onnx/OfflineDolphinModelConfig;)V", "getFireRedAsr", "()Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrModelConfig;", "setFireRedAsr", "(Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrModelConfig;)V", "getFireRedAsrCtc", "()Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrCtcModelConfig;", "setFireRedAsrCtc", "(Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrCtcModelConfig;)V", "getFunasrNano", "()Lcom/k2fsa/sherpa/onnx/OfflineFunAsrNanoModelConfig;", "setFunasrNano", "(Lcom/k2fsa/sherpa/onnx/OfflineFunAsrNanoModelConfig;)V", "getMedasr", "()Lcom/k2fsa/sherpa/onnx/OfflineMedAsrCtcModelConfig;", "setMedasr", "(Lcom/k2fsa/sherpa/onnx/OfflineMedAsrCtcModelConfig;)V", "getModelType", "setModelType", "getModelingUnit", "setModelingUnit", "getMoonshine", "()Lcom/k2fsa/sherpa/onnx/OfflineMoonshineModelConfig;", "setMoonshine", "(Lcom/k2fsa/sherpa/onnx/OfflineMoonshineModelConfig;)V", "getNemo", "()Lcom/k2fsa/sherpa/onnx/OfflineNemoEncDecCtcModelConfig;", "setNemo", "(Lcom/k2fsa/sherpa/onnx/OfflineNemoEncDecCtcModelConfig;)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getOmnilingual", "()Lcom/k2fsa/sherpa/onnx/OfflineOmnilingualAsrCtcModelConfig;", "setOmnilingual", "(Lcom/k2fsa/sherpa/onnx/OfflineOmnilingualAsrCtcModelConfig;)V", "getParaformer", "()Lcom/k2fsa/sherpa/onnx/OfflineParaformerModelConfig;", "setParaformer", "(Lcom/k2fsa/sherpa/onnx/OfflineParaformerModelConfig;)V", "getProvider", "setProvider", "getQwen3Asr", "()Lcom/k2fsa/sherpa/onnx/OfflineQwen3AsrModelConfig;", "setQwen3Asr", "(Lcom/k2fsa/sherpa/onnx/OfflineQwen3AsrModelConfig;)V", "getSenseVoice", "()Lcom/k2fsa/sherpa/onnx/OfflineSenseVoiceModelConfig;", "setSenseVoice", "(Lcom/k2fsa/sherpa/onnx/OfflineSenseVoiceModelConfig;)V", "getTeleSpeech", "setTeleSpeech", "getTokens", "setTokens", "getTransducer", "()Lcom/k2fsa/sherpa/onnx/OfflineTransducerModelConfig;", "setTransducer", "(Lcom/k2fsa/sherpa/onnx/OfflineTransducerModelConfig;)V", "getWenetCtc", "()Lcom/k2fsa/sherpa/onnx/OfflineWenetCtcModelConfig;", "setWenetCtc", "(Lcom/k2fsa/sherpa/onnx/OfflineWenetCtcModelConfig;)V", "getWhisper", "()Lcom/k2fsa/sherpa/onnx/OfflineWhisperModelConfig;", "setWhisper", "(Lcom/k2fsa/sherpa/onnx/OfflineWhisperModelConfig;)V", "getZipformerCtc", "()Lcom/k2fsa/sherpa/onnx/OfflineZipformerCtcModelConfig;", "setZipformerCtc", "(Lcom/k2fsa/sherpa/onnx/OfflineZipformerCtcModelConfig;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OfflineModelConfig {
    private String bpeVocab;
    private OfflineCanaryModelConfig canary;
    private OfflineCohereTranscribeModelConfig cohereTranscribe;
    private boolean debug;
    private OfflineDolphinModelConfig dolphin;
    private OfflineFireRedAsrModelConfig fireRedAsr;
    private OfflineFireRedAsrCtcModelConfig fireRedAsrCtc;
    private OfflineFunAsrNanoModelConfig funasrNano;
    private OfflineMedAsrCtcModelConfig medasr;
    private String modelType;
    private String modelingUnit;
    private OfflineMoonshineModelConfig moonshine;
    private OfflineNemoEncDecCtcModelConfig nemo;
    private int numThreads;
    private OfflineOmnilingualAsrCtcModelConfig omnilingual;
    private OfflineParaformerModelConfig paraformer;
    private String provider;
    private OfflineQwen3AsrModelConfig qwen3Asr;
    private OfflineSenseVoiceModelConfig senseVoice;
    private String teleSpeech;
    private String tokens;
    private OfflineTransducerModelConfig transducer;
    private OfflineWenetCtcModelConfig wenetCtc;
    private OfflineWhisperModelConfig whisper;
    private OfflineZipformerCtcModelConfig zipformerCtc;

    public OfflineModelConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, 33554431, null);
    }

    public static /* synthetic */ OfflineModelConfig copy$default(OfflineModelConfig offlineModelConfig, OfflineTransducerModelConfig offlineTransducerModelConfig, OfflineParaformerModelConfig offlineParaformerModelConfig, OfflineWhisperModelConfig offlineWhisperModelConfig, OfflineFireRedAsrModelConfig offlineFireRedAsrModelConfig, OfflineMoonshineModelConfig offlineMoonshineModelConfig, OfflineNemoEncDecCtcModelConfig offlineNemoEncDecCtcModelConfig, OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig, OfflineDolphinModelConfig offlineDolphinModelConfig, OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig, OfflineWenetCtcModelConfig offlineWenetCtcModelConfig, OfflineOmnilingualAsrCtcModelConfig offlineOmnilingualAsrCtcModelConfig, OfflineMedAsrCtcModelConfig offlineMedAsrCtcModelConfig, OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig, OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig, OfflineFireRedAsrCtcModelConfig offlineFireRedAsrCtcModelConfig, OfflineCanaryModelConfig offlineCanaryModelConfig, OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig, String str, int i10, boolean z10, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        String str7;
        String str8;
        OfflineTransducerModelConfig offlineTransducerModelConfig2 = (i11 & 1) != 0 ? offlineModelConfig.transducer : offlineTransducerModelConfig;
        OfflineParaformerModelConfig offlineParaformerModelConfig2 = (i11 & 2) != 0 ? offlineModelConfig.paraformer : offlineParaformerModelConfig;
        OfflineWhisperModelConfig offlineWhisperModelConfig2 = (i11 & 4) != 0 ? offlineModelConfig.whisper : offlineWhisperModelConfig;
        OfflineFireRedAsrModelConfig offlineFireRedAsrModelConfig2 = (i11 & 8) != 0 ? offlineModelConfig.fireRedAsr : offlineFireRedAsrModelConfig;
        OfflineMoonshineModelConfig offlineMoonshineModelConfig2 = (i11 & 16) != 0 ? offlineModelConfig.moonshine : offlineMoonshineModelConfig;
        OfflineNemoEncDecCtcModelConfig offlineNemoEncDecCtcModelConfig2 = (i11 & 32) != 0 ? offlineModelConfig.nemo : offlineNemoEncDecCtcModelConfig;
        OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig2 = (i11 & 64) != 0 ? offlineModelConfig.senseVoice : offlineSenseVoiceModelConfig;
        OfflineDolphinModelConfig offlineDolphinModelConfig2 = (i11 & 128) != 0 ? offlineModelConfig.dolphin : offlineDolphinModelConfig;
        OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig2 = (i11 & 256) != 0 ? offlineModelConfig.zipformerCtc : offlineZipformerCtcModelConfig;
        OfflineWenetCtcModelConfig offlineWenetCtcModelConfig2 = (i11 & 512) != 0 ? offlineModelConfig.wenetCtc : offlineWenetCtcModelConfig;
        OfflineOmnilingualAsrCtcModelConfig offlineOmnilingualAsrCtcModelConfig2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? offlineModelConfig.omnilingual : offlineOmnilingualAsrCtcModelConfig;
        OfflineMedAsrCtcModelConfig offlineMedAsrCtcModelConfig2 = (i11 & 2048) != 0 ? offlineModelConfig.medasr : offlineMedAsrCtcModelConfig;
        OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig2 = (i11 & 4096) != 0 ? offlineModelConfig.funasrNano : offlineFunAsrNanoModelConfig;
        OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig2 = (i11 & 8192) != 0 ? offlineModelConfig.qwen3Asr : offlineQwen3AsrModelConfig;
        OfflineTransducerModelConfig offlineTransducerModelConfig3 = offlineTransducerModelConfig2;
        OfflineFireRedAsrCtcModelConfig offlineFireRedAsrCtcModelConfig2 = (i11 & 16384) != 0 ? offlineModelConfig.fireRedAsrCtc : offlineFireRedAsrCtcModelConfig;
        OfflineCanaryModelConfig offlineCanaryModelConfig2 = (i11 & 32768) != 0 ? offlineModelConfig.canary : offlineCanaryModelConfig;
        OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig2 = (i11 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? offlineModelConfig.cohereTranscribe : offlineCohereTranscribeModelConfig;
        String str9 = (i11 & 131072) != 0 ? offlineModelConfig.teleSpeech : str;
        int i12 = (i11 & MediaHttpUploader.MINIMUM_CHUNK_SIZE) != 0 ? offlineModelConfig.numThreads : i10;
        boolean z11 = (i11 & 524288) != 0 ? offlineModelConfig.debug : z10;
        String str10 = (i11 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? offlineModelConfig.provider : str2;
        String str11 = (i11 & 2097152) != 0 ? offlineModelConfig.modelType : str3;
        String str12 = (i11 & 4194304) != 0 ? offlineModelConfig.tokens : str4;
        String str13 = (i11 & 8388608) != 0 ? offlineModelConfig.modelingUnit : str5;
        if ((i11 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0) {
            str8 = str13;
            str7 = offlineModelConfig.bpeVocab;
        } else {
            str7 = str6;
            str8 = str13;
        }
        return offlineModelConfig.copy(offlineTransducerModelConfig3, offlineParaformerModelConfig2, offlineWhisperModelConfig2, offlineFireRedAsrModelConfig2, offlineMoonshineModelConfig2, offlineNemoEncDecCtcModelConfig2, offlineSenseVoiceModelConfig2, offlineDolphinModelConfig2, offlineZipformerCtcModelConfig2, offlineWenetCtcModelConfig2, offlineOmnilingualAsrCtcModelConfig2, offlineMedAsrCtcModelConfig2, offlineFunAsrNanoModelConfig2, offlineQwen3AsrModelConfig2, offlineFireRedAsrCtcModelConfig2, offlineCanaryModelConfig2, offlineCohereTranscribeModelConfig2, str9, i12, z11, str10, str11, str12, str8, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OfflineTransducerModelConfig getTransducer() {
        return this.transducer;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final OfflineWenetCtcModelConfig getWenetCtc() {
        return this.wenetCtc;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final OfflineOmnilingualAsrCtcModelConfig getOmnilingual() {
        return this.omnilingual;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final OfflineMedAsrCtcModelConfig getMedasr() {
        return this.medasr;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final OfflineFunAsrNanoModelConfig getFunasrNano() {
        return this.funasrNano;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final OfflineQwen3AsrModelConfig getQwen3Asr() {
        return this.qwen3Asr;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final OfflineFireRedAsrCtcModelConfig getFireRedAsrCtc() {
        return this.fireRedAsrCtc;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final OfflineCanaryModelConfig getCanary() {
        return this.canary;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final OfflineCohereTranscribeModelConfig getCohereTranscribe() {
        return this.cohereTranscribe;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTeleSpeech() {
        return this.teleSpeech;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getNumThreads() {
        return this.numThreads;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OfflineParaformerModelConfig getParaformer() {
        return this.paraformer;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getDebug() {
        return this.debug;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getModelType() {
        return this.modelType;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTokens() {
        return this.tokens;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getModelingUnit() {
        return this.modelingUnit;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getBpeVocab() {
        return this.bpeVocab;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OfflineWhisperModelConfig getWhisper() {
        return this.whisper;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OfflineFireRedAsrModelConfig getFireRedAsr() {
        return this.fireRedAsr;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OfflineMoonshineModelConfig getMoonshine() {
        return this.moonshine;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OfflineNemoEncDecCtcModelConfig getNemo() {
        return this.nemo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OfflineSenseVoiceModelConfig getSenseVoice() {
        return this.senseVoice;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OfflineDolphinModelConfig getDolphin() {
        return this.dolphin;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OfflineZipformerCtcModelConfig getZipformerCtc() {
        return this.zipformerCtc;
    }

    public final OfflineModelConfig copy(OfflineTransducerModelConfig transducer, OfflineParaformerModelConfig paraformer, OfflineWhisperModelConfig whisper, OfflineFireRedAsrModelConfig fireRedAsr, OfflineMoonshineModelConfig moonshine, OfflineNemoEncDecCtcModelConfig nemo, OfflineSenseVoiceModelConfig senseVoice, OfflineDolphinModelConfig dolphin, OfflineZipformerCtcModelConfig zipformerCtc, OfflineWenetCtcModelConfig wenetCtc, OfflineOmnilingualAsrCtcModelConfig omnilingual, OfflineMedAsrCtcModelConfig medasr, OfflineFunAsrNanoModelConfig funasrNano, OfflineQwen3AsrModelConfig qwen3Asr, OfflineFireRedAsrCtcModelConfig fireRedAsrCtc, OfflineCanaryModelConfig canary, OfflineCohereTranscribeModelConfig cohereTranscribe, String teleSpeech, int numThreads, boolean debug, String provider, String modelType, String tokens, String modelingUnit, String bpeVocab) {
        s.h(transducer, "transducer");
        s.h(paraformer, "paraformer");
        s.h(whisper, "whisper");
        s.h(fireRedAsr, "fireRedAsr");
        s.h(moonshine, "moonshine");
        s.h(nemo, "nemo");
        s.h(senseVoice, "senseVoice");
        s.h(dolphin, "dolphin");
        s.h(zipformerCtc, "zipformerCtc");
        s.h(wenetCtc, "wenetCtc");
        s.h(omnilingual, "omnilingual");
        s.h(medasr, "medasr");
        s.h(funasrNano, "funasrNano");
        s.h(qwen3Asr, "qwen3Asr");
        s.h(fireRedAsrCtc, "fireRedAsrCtc");
        s.h(canary, "canary");
        s.h(cohereTranscribe, "cohereTranscribe");
        s.h(teleSpeech, "teleSpeech");
        s.h(provider, "provider");
        s.h(modelType, "modelType");
        s.h(tokens, "tokens");
        s.h(modelingUnit, "modelingUnit");
        s.h(bpeVocab, "bpeVocab");
        return new OfflineModelConfig(transducer, paraformer, whisper, fireRedAsr, moonshine, nemo, senseVoice, dolphin, zipformerCtc, wenetCtc, omnilingual, medasr, funasrNano, qwen3Asr, fireRedAsrCtc, canary, cohereTranscribe, teleSpeech, numThreads, debug, provider, modelType, tokens, modelingUnit, bpeVocab);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineModelConfig)) {
            return false;
        }
        OfflineModelConfig offlineModelConfig = (OfflineModelConfig) other;
        return s.c(this.transducer, offlineModelConfig.transducer) && s.c(this.paraformer, offlineModelConfig.paraformer) && s.c(this.whisper, offlineModelConfig.whisper) && s.c(this.fireRedAsr, offlineModelConfig.fireRedAsr) && s.c(this.moonshine, offlineModelConfig.moonshine) && s.c(this.nemo, offlineModelConfig.nemo) && s.c(this.senseVoice, offlineModelConfig.senseVoice) && s.c(this.dolphin, offlineModelConfig.dolphin) && s.c(this.zipformerCtc, offlineModelConfig.zipformerCtc) && s.c(this.wenetCtc, offlineModelConfig.wenetCtc) && s.c(this.omnilingual, offlineModelConfig.omnilingual) && s.c(this.medasr, offlineModelConfig.medasr) && s.c(this.funasrNano, offlineModelConfig.funasrNano) && s.c(this.qwen3Asr, offlineModelConfig.qwen3Asr) && s.c(this.fireRedAsrCtc, offlineModelConfig.fireRedAsrCtc) && s.c(this.canary, offlineModelConfig.canary) && s.c(this.cohereTranscribe, offlineModelConfig.cohereTranscribe) && s.c(this.teleSpeech, offlineModelConfig.teleSpeech) && this.numThreads == offlineModelConfig.numThreads && this.debug == offlineModelConfig.debug && s.c(this.provider, offlineModelConfig.provider) && s.c(this.modelType, offlineModelConfig.modelType) && s.c(this.tokens, offlineModelConfig.tokens) && s.c(this.modelingUnit, offlineModelConfig.modelingUnit) && s.c(this.bpeVocab, offlineModelConfig.bpeVocab);
    }

    public final String getBpeVocab() {
        return this.bpeVocab;
    }

    public final OfflineCanaryModelConfig getCanary() {
        return this.canary;
    }

    public final OfflineCohereTranscribeModelConfig getCohereTranscribe() {
        return this.cohereTranscribe;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final OfflineDolphinModelConfig getDolphin() {
        return this.dolphin;
    }

    public final OfflineFireRedAsrModelConfig getFireRedAsr() {
        return this.fireRedAsr;
    }

    public final OfflineFireRedAsrCtcModelConfig getFireRedAsrCtc() {
        return this.fireRedAsrCtc;
    }

    public final OfflineFunAsrNanoModelConfig getFunasrNano() {
        return this.funasrNano;
    }

    public final OfflineMedAsrCtcModelConfig getMedasr() {
        return this.medasr;
    }

    public final String getModelType() {
        return this.modelType;
    }

    public final String getModelingUnit() {
        return this.modelingUnit;
    }

    public final OfflineMoonshineModelConfig getMoonshine() {
        return this.moonshine;
    }

    public final OfflineNemoEncDecCtcModelConfig getNemo() {
        return this.nemo;
    }

    public final int getNumThreads() {
        return this.numThreads;
    }

    public final OfflineOmnilingualAsrCtcModelConfig getOmnilingual() {
        return this.omnilingual;
    }

    public final OfflineParaformerModelConfig getParaformer() {
        return this.paraformer;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final OfflineQwen3AsrModelConfig getQwen3Asr() {
        return this.qwen3Asr;
    }

    public final OfflineSenseVoiceModelConfig getSenseVoice() {
        return this.senseVoice;
    }

    public final String getTeleSpeech() {
        return this.teleSpeech;
    }

    public final String getTokens() {
        return this.tokens;
    }

    public final OfflineTransducerModelConfig getTransducer() {
        return this.transducer;
    }

    public final OfflineWenetCtcModelConfig getWenetCtc() {
        return this.wenetCtc;
    }

    public final OfflineWhisperModelConfig getWhisper() {
        return this.whisper;
    }

    public final OfflineZipformerCtcModelConfig getZipformerCtc() {
        return this.zipformerCtc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37, types: [int] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((this.transducer.hashCode() * 31) + this.paraformer.hashCode()) * 31) + this.whisper.hashCode()) * 31) + this.fireRedAsr.hashCode()) * 31) + this.moonshine.hashCode()) * 31) + this.nemo.hashCode()) * 31) + this.senseVoice.hashCode()) * 31) + this.dolphin.hashCode()) * 31) + this.zipformerCtc.hashCode()) * 31) + this.wenetCtc.hashCode()) * 31) + this.omnilingual.hashCode()) * 31) + this.medasr.hashCode()) * 31) + this.funasrNano.hashCode()) * 31) + this.qwen3Asr.hashCode()) * 31) + this.fireRedAsrCtc.hashCode()) * 31) + this.canary.hashCode()) * 31) + this.cohereTranscribe.hashCode()) * 31) + this.teleSpeech.hashCode()) * 31) + Integer.hashCode(this.numThreads)) * 31;
        boolean z10 = this.debug;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return ((((((((((iHashCode + r10) * 31) + this.provider.hashCode()) * 31) + this.modelType.hashCode()) * 31) + this.tokens.hashCode()) * 31) + this.modelingUnit.hashCode()) * 31) + this.bpeVocab.hashCode();
    }

    public final void setBpeVocab(String str) {
        s.h(str, "<set-?>");
        this.bpeVocab = str;
    }

    public final void setCanary(OfflineCanaryModelConfig offlineCanaryModelConfig) {
        s.h(offlineCanaryModelConfig, "<set-?>");
        this.canary = offlineCanaryModelConfig;
    }

    public final void setCohereTranscribe(OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig) {
        s.h(offlineCohereTranscribeModelConfig, "<set-?>");
        this.cohereTranscribe = offlineCohereTranscribeModelConfig;
    }

    public final void setDebug(boolean z10) {
        this.debug = z10;
    }

    public final void setDolphin(OfflineDolphinModelConfig offlineDolphinModelConfig) {
        s.h(offlineDolphinModelConfig, "<set-?>");
        this.dolphin = offlineDolphinModelConfig;
    }

    public final void setFireRedAsr(OfflineFireRedAsrModelConfig offlineFireRedAsrModelConfig) {
        s.h(offlineFireRedAsrModelConfig, "<set-?>");
        this.fireRedAsr = offlineFireRedAsrModelConfig;
    }

    public final void setFireRedAsrCtc(OfflineFireRedAsrCtcModelConfig offlineFireRedAsrCtcModelConfig) {
        s.h(offlineFireRedAsrCtcModelConfig, "<set-?>");
        this.fireRedAsrCtc = offlineFireRedAsrCtcModelConfig;
    }

    public final void setFunasrNano(OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig) {
        s.h(offlineFunAsrNanoModelConfig, "<set-?>");
        this.funasrNano = offlineFunAsrNanoModelConfig;
    }

    public final void setMedasr(OfflineMedAsrCtcModelConfig offlineMedAsrCtcModelConfig) {
        s.h(offlineMedAsrCtcModelConfig, "<set-?>");
        this.medasr = offlineMedAsrCtcModelConfig;
    }

    public final void setModelType(String str) {
        s.h(str, "<set-?>");
        this.modelType = str;
    }

    public final void setModelingUnit(String str) {
        s.h(str, "<set-?>");
        this.modelingUnit = str;
    }

    public final void setMoonshine(OfflineMoonshineModelConfig offlineMoonshineModelConfig) {
        s.h(offlineMoonshineModelConfig, "<set-?>");
        this.moonshine = offlineMoonshineModelConfig;
    }

    public final void setNemo(OfflineNemoEncDecCtcModelConfig offlineNemoEncDecCtcModelConfig) {
        s.h(offlineNemoEncDecCtcModelConfig, "<set-?>");
        this.nemo = offlineNemoEncDecCtcModelConfig;
    }

    public final void setNumThreads(int i10) {
        this.numThreads = i10;
    }

    public final void setOmnilingual(OfflineOmnilingualAsrCtcModelConfig offlineOmnilingualAsrCtcModelConfig) {
        s.h(offlineOmnilingualAsrCtcModelConfig, "<set-?>");
        this.omnilingual = offlineOmnilingualAsrCtcModelConfig;
    }

    public final void setParaformer(OfflineParaformerModelConfig offlineParaformerModelConfig) {
        s.h(offlineParaformerModelConfig, "<set-?>");
        this.paraformer = offlineParaformerModelConfig;
    }

    public final void setProvider(String str) {
        s.h(str, "<set-?>");
        this.provider = str;
    }

    public final void setQwen3Asr(OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig) {
        s.h(offlineQwen3AsrModelConfig, "<set-?>");
        this.qwen3Asr = offlineQwen3AsrModelConfig;
    }

    public final void setSenseVoice(OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig) {
        s.h(offlineSenseVoiceModelConfig, "<set-?>");
        this.senseVoice = offlineSenseVoiceModelConfig;
    }

    public final void setTeleSpeech(String str) {
        s.h(str, "<set-?>");
        this.teleSpeech = str;
    }

    public final void setTokens(String str) {
        s.h(str, "<set-?>");
        this.tokens = str;
    }

    public final void setTransducer(OfflineTransducerModelConfig offlineTransducerModelConfig) {
        s.h(offlineTransducerModelConfig, "<set-?>");
        this.transducer = offlineTransducerModelConfig;
    }

    public final void setWenetCtc(OfflineWenetCtcModelConfig offlineWenetCtcModelConfig) {
        s.h(offlineWenetCtcModelConfig, "<set-?>");
        this.wenetCtc = offlineWenetCtcModelConfig;
    }

    public final void setWhisper(OfflineWhisperModelConfig offlineWhisperModelConfig) {
        s.h(offlineWhisperModelConfig, "<set-?>");
        this.whisper = offlineWhisperModelConfig;
    }

    public final void setZipformerCtc(OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig) {
        s.h(offlineZipformerCtcModelConfig, "<set-?>");
        this.zipformerCtc = offlineZipformerCtcModelConfig;
    }

    public String toString() {
        return "OfflineModelConfig(transducer=" + this.transducer + ", paraformer=" + this.paraformer + ", whisper=" + this.whisper + ", fireRedAsr=" + this.fireRedAsr + ", moonshine=" + this.moonshine + ", nemo=" + this.nemo + ", senseVoice=" + this.senseVoice + ", dolphin=" + this.dolphin + ", zipformerCtc=" + this.zipformerCtc + ", wenetCtc=" + this.wenetCtc + ", omnilingual=" + this.omnilingual + ", medasr=" + this.medasr + ", funasrNano=" + this.funasrNano + ", qwen3Asr=" + this.qwen3Asr + ", fireRedAsrCtc=" + this.fireRedAsrCtc + ", canary=" + this.canary + ", cohereTranscribe=" + this.cohereTranscribe + ", teleSpeech=" + this.teleSpeech + ", numThreads=" + this.numThreads + ", debug=" + this.debug + ", provider=" + this.provider + ", modelType=" + this.modelType + ", tokens=" + this.tokens + ", modelingUnit=" + this.modelingUnit + ", bpeVocab=" + this.bpeVocab + ')';
    }

    public OfflineModelConfig(OfflineTransducerModelConfig transducer, OfflineParaformerModelConfig paraformer, OfflineWhisperModelConfig whisper, OfflineFireRedAsrModelConfig fireRedAsr, OfflineMoonshineModelConfig moonshine, OfflineNemoEncDecCtcModelConfig nemo, OfflineSenseVoiceModelConfig senseVoice, OfflineDolphinModelConfig dolphin, OfflineZipformerCtcModelConfig zipformerCtc, OfflineWenetCtcModelConfig wenetCtc, OfflineOmnilingualAsrCtcModelConfig omnilingual, OfflineMedAsrCtcModelConfig medasr, OfflineFunAsrNanoModelConfig funasrNano, OfflineQwen3AsrModelConfig qwen3Asr, OfflineFireRedAsrCtcModelConfig fireRedAsrCtc, OfflineCanaryModelConfig canary, OfflineCohereTranscribeModelConfig cohereTranscribe, String teleSpeech, int i10, boolean z10, String provider, String modelType, String tokens, String modelingUnit, String bpeVocab) {
        s.h(transducer, "transducer");
        s.h(paraformer, "paraformer");
        s.h(whisper, "whisper");
        s.h(fireRedAsr, "fireRedAsr");
        s.h(moonshine, "moonshine");
        s.h(nemo, "nemo");
        s.h(senseVoice, "senseVoice");
        s.h(dolphin, "dolphin");
        s.h(zipformerCtc, "zipformerCtc");
        s.h(wenetCtc, "wenetCtc");
        s.h(omnilingual, "omnilingual");
        s.h(medasr, "medasr");
        s.h(funasrNano, "funasrNano");
        s.h(qwen3Asr, "qwen3Asr");
        s.h(fireRedAsrCtc, "fireRedAsrCtc");
        s.h(canary, "canary");
        s.h(cohereTranscribe, "cohereTranscribe");
        s.h(teleSpeech, "teleSpeech");
        s.h(provider, "provider");
        s.h(modelType, "modelType");
        s.h(tokens, "tokens");
        s.h(modelingUnit, "modelingUnit");
        s.h(bpeVocab, "bpeVocab");
        this.transducer = transducer;
        this.paraformer = paraformer;
        this.whisper = whisper;
        this.fireRedAsr = fireRedAsr;
        this.moonshine = moonshine;
        this.nemo = nemo;
        this.senseVoice = senseVoice;
        this.dolphin = dolphin;
        this.zipformerCtc = zipformerCtc;
        this.wenetCtc = wenetCtc;
        this.omnilingual = omnilingual;
        this.medasr = medasr;
        this.funasrNano = funasrNano;
        this.qwen3Asr = qwen3Asr;
        this.fireRedAsrCtc = fireRedAsrCtc;
        this.canary = canary;
        this.cohereTranscribe = cohereTranscribe;
        this.teleSpeech = teleSpeech;
        this.numThreads = i10;
        this.debug = z10;
        this.provider = provider;
        this.modelType = modelType;
        this.tokens = tokens;
        this.modelingUnit = modelingUnit;
        this.bpeVocab = bpeVocab;
    }

    public /* synthetic */ OfflineModelConfig(OfflineTransducerModelConfig offlineTransducerModelConfig, OfflineParaformerModelConfig offlineParaformerModelConfig, OfflineWhisperModelConfig offlineWhisperModelConfig, OfflineFireRedAsrModelConfig offlineFireRedAsrModelConfig, OfflineMoonshineModelConfig offlineMoonshineModelConfig, OfflineNemoEncDecCtcModelConfig offlineNemoEncDecCtcModelConfig, OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig, OfflineDolphinModelConfig offlineDolphinModelConfig, OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig, OfflineWenetCtcModelConfig offlineWenetCtcModelConfig, OfflineOmnilingualAsrCtcModelConfig offlineOmnilingualAsrCtcModelConfig, OfflineMedAsrCtcModelConfig offlineMedAsrCtcModelConfig, OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig, OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig, OfflineFireRedAsrCtcModelConfig offlineFireRedAsrCtcModelConfig, OfflineCanaryModelConfig offlineCanaryModelConfig, OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig, String str, int i10, boolean z10, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new OfflineTransducerModelConfig(null, null, null, 7, null) : offlineTransducerModelConfig, (i11 & 2) != 0 ? new OfflineParaformerModelConfig(null, null, 3, null) : offlineParaformerModelConfig, (i11 & 4) != 0 ? new OfflineWhisperModelConfig(null, null, null, null, 0, false, false, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null) : offlineWhisperModelConfig, (i11 & 8) != 0 ? new OfflineFireRedAsrModelConfig(null, null, 3, null) : offlineFireRedAsrModelConfig, (i11 & 16) != 0 ? new OfflineMoonshineModelConfig(null, null, null, null, null, 31, null) : offlineMoonshineModelConfig, (i11 & 32) != 0 ? new OfflineNemoEncDecCtcModelConfig(null, 1, null) : offlineNemoEncDecCtcModelConfig, (i11 & 64) != 0 ? new OfflineSenseVoiceModelConfig(null, null, false, null, 15, null) : offlineSenseVoiceModelConfig, (i11 & 128) != 0 ? new OfflineDolphinModelConfig(null, 1, null) : offlineDolphinModelConfig, (i11 & 256) != 0 ? new OfflineZipformerCtcModelConfig(null, null, 3, null) : offlineZipformerCtcModelConfig, (i11 & 512) != 0 ? new OfflineWenetCtcModelConfig(null, 1, null) : offlineWenetCtcModelConfig, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? new OfflineOmnilingualAsrCtcModelConfig(null, 1, null) : offlineOmnilingualAsrCtcModelConfig, (i11 & 2048) != 0 ? new OfflineMedAsrCtcModelConfig(null, 1, null) : offlineMedAsrCtcModelConfig, (i11 & 4096) != 0 ? new OfflineFunAsrNanoModelConfig(null, null, null, null, null, null, 0, 0.0f, 0.0f, 0, null, false, null, 8191, null) : offlineFunAsrNanoModelConfig, (i11 & 8192) != 0 ? new OfflineQwen3AsrModelConfig(null, null, null, null, 0, 0, 0.0f, 0.0f, 0, null, 1023, null) : offlineQwen3AsrModelConfig, (i11 & 16384) != 0 ? new OfflineFireRedAsrCtcModelConfig(null, 1, null) : offlineFireRedAsrCtcModelConfig, (i11 & 32768) != 0 ? new OfflineCanaryModelConfig(null, null, null, null, false, 31, null) : offlineCanaryModelConfig, (i11 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? new OfflineCohereTranscribeModelConfig(null, null, null, false, false, 31, null) : offlineCohereTranscribeModelConfig, (i11 & 131072) != 0 ? "" : str, (i11 & MediaHttpUploader.MINIMUM_CHUNK_SIZE) == 0 ? i10 : 1, (i11 & 524288) != 0 ? false : z10, (i11 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? "cpu" : str2, (i11 & 2097152) != 0 ? "" : str3, (i11 & 4194304) != 0 ? "" : str4, (i11 & 8388608) != 0 ? "" : str5, (i11 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? "" : str6);
    }
}
