//package org.pg.etherum;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.web3j.crypto.*;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.core.DefaultBlockParameterNumber;
//import org.web3j.protocol.core.methods.response.EthBlock;
//import org.web3j.protocol.core.methods.response.EthBlockNumber;
//import org.web3j.protocol.core.methods.response.Transaction;
//import org.web3j.protocol.core.methods.response.Web3ClientVersion;
//import org.web3j.protocol.exceptions.TransactionException;
//import org.web3j.protocol.http.HttpService;
//import org.web3j.tx.Transfer;
//import org.web3j.utils.Convert;
//
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.util.List;
//
//@Slf4j
//public class EtherumClient {
//    static Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
//
//    public static void main(String[] args) throws Exception {
//        connect();
//
//        EthBlockNumber current = getCurrentBlock();
//
////        listLastBlocks(current, 10);
////        listCurrentBlockTransactions(current);
//
//        Credentials credentials = WalletUtils.loadCredentials("", "");
//        Transfer.sendFunds(web3, credentials, "",new BigDecimal(100), Convert.Unit.ETHER).send();
//
//    }
//
//    private static void listCurrentBlockTransactions(EthBlockNumber current) throws IOException {
//        log.info("Listing transactions from last block...");
//        web3
//                .ethGetBlockByNumber(numParam(current), true)
//                .send()
//                .getBlock()
//                .getTransactions()
//                .forEach((o) -> {
//                    EthBlock.TransactionObject to = (EthBlock.TransactionObject) o.get();
//                    Transaction transaction = to.get();
//
//                    log.info("from: {}\tto: {}\tvalue: {}\tgas: {}\tgasPrice: {}",
//                            transaction.getFrom(),
//                            transaction.getTo(),
//                            transaction.getValue(),
//                            transaction.getGas(),
//                            transaction.getGasPrice()
//                    );
//                });
//    }
//
//    private static EthBlockNumber getCurrentBlock() throws IOException {
//        EthBlockNumber current = web3.ethBlockNumber().send();
//        log.info("Current block: {}", current.getBlockNumber());
//        return current;
//    }
//
//    private static DefaultBlockParameterNumber numParam(EthBlockNumber current) {
//        return new DefaultBlockParameterNumber(current.getBlockNumber());
//    }
//
//    private static void listLastBlocks(EthBlockNumber current, int numOfBlocks) throws IOException {
//        log.info("Listing last blocks...");
//        for (int i = 0; i < numOfBlocks; i++) {
//            BigInteger val = new BigInteger(String.valueOf(i));
//            EthBlock block = web3
//                    .ethGetBlockByNumber(new DefaultBlockParameterNumber(current.getBlockNumber().subtract(val)), false)
//                    .send();
//
//            EthBlock.Block blockResult = block.getResult();
//            log.info("hash: {}\tnumber: {}\tparent_hash: {}", blockResult.getHash(), blockResult.getNumber(), blockResult.getParentHash());
//        }
//    }
//
//    private static void connect() throws IOException {
//        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().send();
//        String clientVersion = web3ClientVersion.getWeb3ClientVersion();
//
//        log.info("Version: {}", clientVersion);
//
//
//    }
//
//
//}
