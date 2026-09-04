/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00022c1c
 * Address  : 00022c1c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00022c1c(undefined4 *param_1)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  char *pcVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  undefined4 uVar8;
  int *piVar9;
  int iVar10;
  char *pcVar11;
  int unaff_r6;
  int iVar12;
  undefined1 uVar13;
  
  iVar1 = FUN_0001e1a4();
  iVar2 = FUN_0001bec0(param_1,DAT_00022e30 + 0x22c36,2);
  if (iVar2 == 0) {
    iVar2 = FUN_0001bec0(param_1,DAT_00022e44 + 0x22d08,2);
    if (iVar2 == 0) {
      iVar2 = FUN_0001bec0(param_1,DAT_00022e4c + 0x22d54,2);
      if (iVar2 == 0) {
        piVar3 = (int *)0x0;
        goto LAB_00022c48;
      }
      iVar2 = param_1[2];
      iVar5 = param_1[3];
      while ((pcVar4 = (char *)*param_1, pcVar4 == (char *)param_1[1] || (*pcVar4 != 'E'))) {
        unaff_r6 = FUN_0001c660(param_1);
        if (unaff_r6 == 0) {
          return (int *)0x0;
        }
        FUN_0001d7c0(param_1 + 2,&stack0xffffffd4);
      }
      *param_1 = pcVar4 + 1;
      FUN_0001d830(&stack0xffffffd4,param_1,iVar5 - iVar2 >> 2);
      piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      *(undefined1 *)(piVar3 + 1) = 0x12;
      *piVar3 = DAT_00022e50 + 0x22dc8;
      piVar3[2] = unaff_r6;
      piVar3[3] = (int)&stack0xfffffff8;
    }
    else {
      iVar2 = FUN_0001eb18(param_1);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      pcVar4 = (char *)*param_1;
      if (pcVar4 == (char *)param_1[1]) {
        return (int *)0x0;
      }
      if (*pcVar4 != 'E') {
        return (int *)0x0;
      }
      *param_1 = pcVar4 + 1;
      piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      *(undefined1 *)(piVar3 + 1) = 0x11;
      piVar3[2] = iVar2;
      *piVar3 = DAT_00022e48 + 0x22d4c;
    }
    *(ushort *)((int)piVar3 + 5) = (*(ushort *)((int)piVar3 + 5) & 0xf000) + 0x540;
  }
  else {
    piVar3 = (int *)FUN_000230b4(param_1,DAT_00022e34 + 0x22c44);
  }
LAB_00022c48:
  FUN_0001bec0(param_1,DAT_00022e38 + 0x22c52,2);
  pcVar4 = (char *)*param_1;
  if ((pcVar4 != (char *)param_1[1]) && (*pcVar4 == 'F')) {
    pcVar11 = pcVar4 + 1;
    *param_1 = pcVar11;
    if ((pcVar11 != (char *)param_1[1]) && (*pcVar11 == 'Y')) {
      *param_1 = pcVar4 + 2;
    }
    iVar2 = FUN_0001c660(param_1);
    if (iVar2 != 0) {
      iVar5 = param_1[2];
      uVar13 = 2;
      iVar10 = param_1[3];
      iVar12 = DAT_00022e3c + 0x22ca8;
      iVar6 = DAT_00022e40 + 0x22caa;
LAB_00022caa:
      while (pcVar4 = (char *)*param_1, pcVar4 != (char *)param_1[1]) {
        if (*pcVar4 == 'E') {
          uVar13 = 0;
          *param_1 = pcVar4 + 1;
          goto LAB_00022dea;
        }
        if (*pcVar4 != 'v') break;
        *param_1 = pcVar4 + 1;
      }
      iVar7 = FUN_0001bec0(param_1,iVar12,2);
      if (iVar7 == 0) {
        iVar7 = FUN_0001bec0(param_1,iVar6,2);
        if (iVar7 == 0) {
          unaff_r6 = FUN_0001c660(param_1);
          if (unaff_r6 == 0) {
            return (int *)0x0;
          }
          FUN_0001d7c0(param_1 + 2,&stack0xffffffd4);
          goto LAB_00022caa;
        }
      }
      else {
        uVar13 = 1;
      }
LAB_00022dea:
      FUN_0001d830(&stack0xffffffd4,param_1,iVar10 - iVar5 >> 2);
      uVar8 = FUN_0001dbc0(param_1 + 0x66,0x20);
      piVar9 = (int *)FUN_0001e9c0(uVar8,0x10,0,1,0);
      piVar9[7] = (int)piVar3;
      piVar9[2] = iVar2;
      piVar9[3] = unaff_r6;
      piVar9[4] = (int)&stack0xfffffff8;
      *(undefined1 *)(piVar9 + 6) = uVar13;
      piVar9[5] = iVar1;
      *piVar9 = DAT_00022e54 + 0x22e32;
      return piVar9;
    }
  }
  return (int *)0x0;
}


