/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020128
 * Address  : 00020128
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00020128(undefined4 *param_1)

{
  char cVar1;
  char *pcVar2;
  int *piVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  undefined1 uStack_21;
  int local_20;
  int local_1c;
  
  pcVar2 = (char *)*param_1;
  if ((((char *)param_1[1] != pcVar2) && (1 < (uint)((int)param_1[1] - (int)pcVar2))) &&
     (*pcVar2 == 'd')) {
    cVar1 = pcVar2[1];
    if (cVar1 == 'X') {
      *param_1 = pcVar2 + 2;
      iVar4 = FUN_0001eb18(param_1);
      if (((iVar4 != 0) && (iVar5 = FUN_0001eb18(param_1), iVar5 != 0)) &&
         (iVar6 = FUN_00020128(param_1), iVar6 != 0)) {
        piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
        *(undefined1 *)(piVar3 + 1) = 0x52;
        piVar3[2] = iVar4;
        piVar3[3] = iVar5;
        piVar3[4] = iVar6;
        *piVar3 = DAT_00020210 + 0x201fa;
        *(ushort *)((int)piVar3 + 5) = (*(ushort *)((int)piVar3 + 5) & 0xf000) + 0x540;
        return piVar3;
      }
    }
    else if (cVar1 == 'x') {
      *param_1 = pcVar2 + 2;
      local_1c = FUN_0001eb18(param_1);
      if ((local_1c != 0) && (local_20 = FUN_00020128(param_1), local_20 != 0)) {
        uStack_21 = 1;
LAB_000201a0:
        piVar3 = (int *)FUN_000219e8(param_1,&local_1c,&local_20,&uStack_21);
        return piVar3;
      }
    }
    else {
      if (cVar1 != 'i') goto LAB_00020176;
      *param_1 = pcVar2 + 2;
      local_1c = FUN_0001dd58(param_1);
      if (local_1c != 0) {
        local_20 = FUN_00020128(param_1);
        uStack_21 = 0;
        if (local_20 == 0) {
          return (int *)0x0;
        }
        goto LAB_000201a0;
      }
    }
    return (int *)0x0;
  }
LAB_00020176:
  piVar3 = (int *)FUN_0001eb18(param_1);
  return piVar3;
}


