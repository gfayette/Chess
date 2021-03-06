package Project3;

/**********************************************************************
 * CIS 163 Section 01
 * Project 3: Chess Game
 * ChessPiece Class
 *
 * This class represents a ChessPiece. It implements the IChessPiece
 * interface.
 *
 * @author George Fayette
 * @version 3/23/2019
 *********************************************************************/
public abstract class ChessPiece implements IChessPiece {

    /**
     * Private Player representing the owner of the chess piece..
     */
    private Player owner;

    /******************************************************************
     * Protected constructor sets player to parameter value.
     * @param player The player type.
     *****************************************************************/
    protected ChessPiece(Player player) {
        this.owner = player;
    }

    /******************************************************************
     * Public abstract String, returns the ChessPiece type.
     * @return A string representing the ChessPiece type.
     *****************************************************************/
    public abstract String type();

    /******************************************************************
     * Public Player, returns the owner of the chess piece.
     * @return A string representing the ChessPiece type.
     *****************************************************************/
    public Player player() {
        return owner;
    }

    /******************************************************************
     * Public boolean, returns true if the move is valid.
     * @param move The move that is being checked.
     * @param board The array of IChessPieces that is being checked.
     * @return True if the move is valid.
     *****************************************************************/
    public boolean isValidMove(Move move, IChessPiece[][] board) {
        IChessPiece moveFrom = board[move.fromRow][move.fromColumn];
        IChessPiece moveTo = board[move.toRow][move.toColumn];

        if (moveTo == moveFrom ||
                (moveTo != null && moveTo.player() == owner)) {
            return false;
        }
        return true;
    }

}