# Dopamine-Auto-Trader

암호화폐 자동매매 시스템으로, 실시간 시세 수집 및 전략 기반 자동 매매 기능을 제공합니다.

## 주요 기능
- 실시간 거래소 데이터 수집 및 분석
- 자동매매 알고리즘(백테스트 지원)
- 외부 거래소 API 연동(Binance 등)
- 거래 내역 기록 및 통계, 위험 관리 모듈

## 기술 스택
- Java, Spring Boot, REST API, WebSocket
- MySQL, Docker

## 프로젝트 구조
- API/자동매매/통계 모듈 분리
- 전략 플러그인 방식 지원
- 외부 연동 인증/보안 처리
- 데이터 실시간성/정확성 확보

## 실행 방법
```bash
./gradlew bootRun
```

## 문의 및 기여
- 이슈 및 PR 환영합니다.
- Contact: robbietaek@gmail.com
