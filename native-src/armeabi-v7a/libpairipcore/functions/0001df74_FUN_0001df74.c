/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001df74
 * Address  : 0001df74
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001df74(undefined4 *param_1,int param_2,undefined4 param_3,undefined4 param_4)

{
  char *pcVar1;
  int *piVar2;
  char *pcVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  ushort uVar8;
  int *piVar9;
  int *piVar10;
  undefined4 *puVar11;
  int *unaff_r5;
  int iVar12;
  int *piVar13;
  int unaff_r6;
  int iVar14;
  ushort uVar15;
  undefined4 *puVar16;
  int *local_28;
  
  local_28 = (int *)&stack0xfffffff8;
  pcVar1 = (char *)*param_1;
  pcVar3 = (char *)param_1[1];
  if ((pcVar1 != pcVar3) && (*pcVar1 == 'I')) {
    pcVar1 = pcVar1 + 1;
    *param_1 = pcVar1;
    if (param_2 != 0) {
      param_1[0x54] = param_1[0x53];
      unaff_r5 = param_1 + 0x48;
      FUN_0001e8dc(param_1 + 0x53,&stack0xffffffd0,0x49,param_4,param_2,param_3,param_4);
      pcVar1 = (char *)*param_1;
      pcVar3 = (char *)param_1[1];
      param_1[0x49] = param_1[0x48];
    }
    piVar2 = param_1 + 2;
    puVar11 = param_1 + 0x48;
    iVar5 = param_1[3] - *piVar2 >> 2;
    iVar6 = DAT_0001e160 + 0x1dfec;
    puVar16 = puVar11;
    do {
      if ((pcVar1 != pcVar3) && (*pcVar1 == 'E')) {
        iVar6 = 0;
        goto LAB_0001e11e;
      }
      if (param_2 == 0) {
        unaff_r5 = (int *)FUN_0001d668(param_1);
        if (unaff_r5 == (int *)0x0) {
          return (int *)0x0;
        }
        FUN_0001d7c0(piVar2,&stack0xffffffd0);
      }
      else {
        unaff_r5 = (int *)FUN_0001d668(param_1);
        if (unaff_r5 == (int *)0x0) {
          return (int *)0x0;
        }
        FUN_0001d7c0(piVar2,&stack0xffffffd0);
        local_28 = unaff_r5;
        if ((char)unaff_r5[1] == ')') {
          piVar10 = (int *)unaff_r5[2];
          iVar12 = unaff_r5[3];
          puVar11 = puVar16;
          local_28 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
          *(undefined1 *)(local_28 + 1) = 0x28;
          iVar14 = iVar12 << 2;
          *local_28 = iVar6;
          local_28[2] = (int)piVar10;
          local_28[3] = iVar12;
          uVar8 = *(ushort *)((int)local_28 + 5) & 0xf000;
          uVar15 = uVar8 + 0xa80;
          *(ushort *)((int)local_28 + 5) = uVar15;
          iVar12 = iVar14;
          piVar13 = piVar10;
          do {
            iVar7 = iVar14;
            piVar9 = piVar10;
            if (iVar12 == 0) {
              uVar15 = uVar8 | 0x980;
              *(ushort *)((int)local_28 + 5) = uVar15;
              break;
            }
            iVar4 = *piVar13;
            piVar13 = piVar13 + 1;
            iVar12 = iVar12 + -4;
          } while ((*(ushort *)(iVar4 + 5) & 0x300) == 0x100);
          do {
            if (iVar7 == 0) {
              uVar15 = uVar15 & 0xf3ff | 0x400;
              *(ushort *)((int)local_28 + 5) = uVar15;
              break;
            }
            iVar12 = *piVar9;
            iVar7 = iVar7 + -4;
            piVar9 = piVar9 + 1;
          } while ((*(ushort *)(iVar12 + 5) & 0xc00) == 0x400);
          do {
            puVar16 = puVar11;
            if (iVar14 == 0) {
              *(ushort *)((int)local_28 + 5) = uVar15 & 0xff7f | 0x40;
              break;
            }
            iVar12 = *piVar10;
            piVar10 = piVar10 + 1;
            iVar14 = iVar14 + -4;
          } while ((*(ushort *)(iVar12 + 5) & 0xc0) == 0x40);
        }
        else if ((char)unaff_r5[1] == '\"') {
          local_28 = (int *)unaff_r5[3];
        }
        FUN_00021370(puVar11,&local_28);
      }
      pcVar1 = (char *)*param_1;
      pcVar3 = (char *)param_1[1];
    } while ((pcVar1 == pcVar3) || (*pcVar1 != 'Q'));
    *param_1 = pcVar1 + 1;
    iVar6 = FUN_0001d8c8(param_1);
    if ((iVar6 != 0) &&
       ((pcVar1 = (char *)*param_1, pcVar1 != (char *)param_1[1] && (*pcVar1 == 'E')))) {
LAB_0001e11e:
      *param_1 = pcVar1 + 1;
      FUN_0001d830(&stack0xffffffd0,param_1,iVar5);
      piVar2 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
      *(undefined1 *)(piVar2 + 1) = 0x2b;
      *piVar2 = DAT_0001e164 + 0x1e14c;
      piVar2[2] = (int)unaff_r5;
      piVar2[3] = unaff_r6;
      piVar2[4] = iVar6;
      *(ushort *)((int)piVar2 + 5) = (*(ushort *)((int)piVar2 + 5) & 0xf000) + 0x540;
      return piVar2;
    }
  }
  return (int *)0x0;
}


