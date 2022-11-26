## 4장 정리

### ✔️ 유비쿼터스 언어란?

- Ubiquitous language
- 에릭 에번스가 집필한 도메인 주도 설계에서 처음 등장
- 개발자와 사용자 모두가 사용할 수 있도록 설계, 공유된 공통 언어

### ✔️ 리스코프 치환 원칙(LSP)

- q(x) 는 T 형식의 x 객체를 증명할 수 있는 공식
- S 형식의 객체 y 가 있고 S 가 T 의 하위형식이라면 q(y) 는 참
- 하위형식에서 선행조건을 더할 수 없음
    - 부모가 지정한 것보다 더 많은 조건을 요구할 수 없다는 뜻
- 하위형식에서 후행조건을 약화시킬 수 없음
- 슈퍼형식의 불변자는 하위형식에서도 보존
- 히스토리 규칙
    - 부모 클래스가 허용하지 않은 상태 변화를 허용하지 않아야 함