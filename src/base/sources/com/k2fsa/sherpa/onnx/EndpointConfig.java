package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/k2fsa/sherpa/onnx/EndpointConfig;", "", "rule1", "Lcom/k2fsa/sherpa/onnx/EndpointRule;", "rule2", "rule3", "(Lcom/k2fsa/sherpa/onnx/EndpointRule;Lcom/k2fsa/sherpa/onnx/EndpointRule;Lcom/k2fsa/sherpa/onnx/EndpointRule;)V", "getRule1", "()Lcom/k2fsa/sherpa/onnx/EndpointRule;", "setRule1", "(Lcom/k2fsa/sherpa/onnx/EndpointRule;)V", "getRule2", "setRule2", "getRule3", "setRule3", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sherpa_onnx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class EndpointConfig {
    private EndpointRule rule1;
    private EndpointRule rule2;
    private EndpointRule rule3;

    public EndpointConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EndpointConfig copy$default(EndpointConfig endpointConfig, EndpointRule endpointRule, EndpointRule endpointRule2, EndpointRule endpointRule3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            endpointRule = endpointConfig.rule1;
        }
        if ((i10 & 2) != 0) {
            endpointRule2 = endpointConfig.rule2;
        }
        if ((i10 & 4) != 0) {
            endpointRule3 = endpointConfig.rule3;
        }
        return endpointConfig.copy(endpointRule, endpointRule2, endpointRule3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EndpointRule getRule1() {
        return this.rule1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EndpointRule getRule2() {
        return this.rule2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EndpointRule getRule3() {
        return this.rule3;
    }

    public final EndpointConfig copy(EndpointRule rule1, EndpointRule rule2, EndpointRule rule3) {
        s.h(rule1, "rule1");
        s.h(rule2, "rule2");
        s.h(rule3, "rule3");
        return new EndpointConfig(rule1, rule2, rule3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndpointConfig)) {
            return false;
        }
        EndpointConfig endpointConfig = (EndpointConfig) other;
        return s.c(this.rule1, endpointConfig.rule1) && s.c(this.rule2, endpointConfig.rule2) && s.c(this.rule3, endpointConfig.rule3);
    }

    public final EndpointRule getRule1() {
        return this.rule1;
    }

    public final EndpointRule getRule2() {
        return this.rule2;
    }

    public final EndpointRule getRule3() {
        return this.rule3;
    }

    public int hashCode() {
        return (((this.rule1.hashCode() * 31) + this.rule2.hashCode()) * 31) + this.rule3.hashCode();
    }

    public final void setRule1(EndpointRule endpointRule) {
        s.h(endpointRule, "<set-?>");
        this.rule1 = endpointRule;
    }

    public final void setRule2(EndpointRule endpointRule) {
        s.h(endpointRule, "<set-?>");
        this.rule2 = endpointRule;
    }

    public final void setRule3(EndpointRule endpointRule) {
        s.h(endpointRule, "<set-?>");
        this.rule3 = endpointRule;
    }

    public String toString() {
        return "EndpointConfig(rule1=" + this.rule1 + ", rule2=" + this.rule2 + ", rule3=" + this.rule3 + ')';
    }

    public EndpointConfig(EndpointRule rule1, EndpointRule rule2, EndpointRule rule3) {
        s.h(rule1, "rule1");
        s.h(rule2, "rule2");
        s.h(rule3, "rule3");
        this.rule1 = rule1;
        this.rule2 = rule2;
        this.rule3 = rule3;
    }

    public /* synthetic */ EndpointConfig(EndpointRule endpointRule, EndpointRule endpointRule2, EndpointRule endpointRule3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new EndpointRule(false, 2.4f, 0.0f) : endpointRule, (i10 & 2) != 0 ? new EndpointRule(true, 1.4f, 0.0f) : endpointRule2, (i10 & 4) != 0 ? new EndpointRule(false, 0.0f, 20.0f) : endpointRule3);
    }
}
