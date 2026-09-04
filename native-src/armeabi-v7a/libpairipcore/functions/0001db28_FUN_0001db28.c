/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001db28
 * Address  : 0001db28
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001db28(undefined4 *param_1,int *param_2)

{
  int iVar1;
  char *pcVar2;
  int iVar3;
  char *pcVar4;
  undefined1 uVar5;
  int *local_28;
  
  local_28 = (int *)&stack0xfffffff8;
  while( true ) {
    pcVar2 = (char *)*param_1;
    if ((pcVar2 == (char *)param_1[1]) || (*pcVar2 != 'W')) {
      return 0;
    }
    pcVar4 = pcVar2 + 1;
    *param_1 = pcVar4;
    if ((pcVar4 == (char *)param_1[1]) || (*pcVar4 != 'P')) {
      uVar5 = 0;
    }
    else {
      uVar5 = 1;
      *param_1 = pcVar2 + 2;
    }
    iVar3 = FUN_0001dd58(param_1);
    if (iVar3 == 0) break;
    local_28 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
    local_28[2] = *param_2;
    *(ushort *)((int)local_28 + 5) = (*(ushort *)((int)local_28 + 5) & 0xf000) + 0x540;
    *(undefined1 *)(local_28 + 1) = 0x1b;
    iVar1 = DAT_0001dbbc;
    *(undefined1 *)(local_28 + 4) = uVar5;
    local_28[3] = iVar3;
    *local_28 = iVar1 + 0x1dba4;
    *param_2 = (int)local_28;
    FUN_0001d7c0(param_1 + 0x25,&local_28);
  }
  return 1;
}


